package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.Token;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static shiver.me.timbers.TestData.WRAPPING_CLASS_OR_INTERFACE_MODIFIER;
import static shiver.me.timbers.TestData.WRAPPING_METHOD_DEFINITION;
import static shiver.me.timbers.TestData.WRAPPING_MODIFIER;
import static shiver.me.timbers.TestData.WRAPPING_PUBLIC;
import static shiver.me.timbers.TestData.WRAPPING_STATIC;
import static shiver.me.timbers.TestData.WRAPPING_TYPE_DECLARATION;
import static shiver.me.timbers.TestData.WRAPPING_VOID;

public class TransformableStringTest {

    private static final String TEST_TEXT = "public static void main() {}";
    private static final String TRANSFORMED_STATIC_TEXT =
            "public ['static'][modifier][typeDeclaration]static[typeDeclaration][modifier]['static'] void main() {}";

    private static final String TRANSFORMED_PUBLIC_AND_STATIC_TEXT =
            "['public'][classOrInterfaceModifier][typeDeclaration]public[typeDeclaration][classOrInterfaceModifier]['public'] " +
                    "['static'][modifier][typeDeclaration]static[typeDeclaration][modifier]['static'] ['void']void['void'] [methodDefinition]main[methodDefinition]() {}";

    private static final int PUBLIC_START_INDEX = 0;
    private static final int PUBLIC_STOP_INDEX = 5;

    private static final int STATIC_START_INDEX = 7;
    private static final int STATIC_STOP_INDEX = 12;

    private static final int VOID_START_INDEX = 14;
    private static final int VOID_STOP_INDEX = 17;

    private TransformableString listener;

    private Token publicToken;
    private Token staticToken;
    private Token voidToken;

    @Before
    public void setUp() {

        listener = new TransformableString(TEST_TEXT);

        publicToken = mock(Token.class);
        when(publicToken.getStartIndex()).thenReturn(PUBLIC_START_INDEX);
        when(publicToken.getStopIndex()).thenReturn(PUBLIC_STOP_INDEX);
        when(publicToken.getText()).thenReturn("public");

        staticToken = mock(Token.class);
        when(staticToken.getStartIndex()).thenReturn(STATIC_START_INDEX);
        when(staticToken.getStopIndex()).thenReturn(STATIC_STOP_INDEX);
        when(staticToken.getText()).thenReturn("static");

        voidToken = mock(Token.class);
        when(voidToken.getStartIndex()).thenReturn(VOID_START_INDEX);
        when(voidToken.getStopIndex()).thenReturn(VOID_STOP_INDEX);
        when(voidToken.getText()).thenReturn("void");
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNull() {

        new TransformableString(null);
    }

    @Test
    public void testIsNewWordWithOldIndex() {

        assertFalse("initial index of 0 and new index of 0 should produce false.", listener.isNewWord(0, 0));
    }

    @Test
    public void testIsNewWordWithNewIndex() {

        assertTrue("initial index of 0 and index of 1 should produce true.", listener.isNewWord(0, 1));
    }

    @Test
    public void testIsNewWordWithNegativeIndex() {

        assertFalse("initial index of 0 and negative index should produce false.", listener.isNewWord(0, -1));
        assertFalse("initial index of 0 and negative index should produce false.", listener.isNewWord(0, -2));
        assertFalse("initial index of 0 and negative index should produce false.", listener.isNewWord(0, -3));
        assertFalse("initial index of 0 and negative index should produce false.", listener.isNewWord(0, -5));
    }

    @Test
    public void testUpdateCurrentOffsetForLongerWord() {

        final int LENGTH = publicToken.getText().length();

        listener.updateCurrentOffset(LENGTH, LENGTH + 5);

        assertEquals("offset should increase", 5, listener.getCurrentOffset());
    }

    @Test
    public void testUpdateCurrentOffsetForMultipleLongerWords() {

        final int LENGTH = publicToken.getText().length();

        listener.updateCurrentOffset(LENGTH, LENGTH + 5);
        listener.updateCurrentOffset(LENGTH, LENGTH + 4);
        listener.updateCurrentOffset(LENGTH, LENGTH + 3);

        assertEquals("offset should increase", 3, listener.getCurrentOffset());
    }

    @Test
    public void testUpdateCurrentOffsetForSameWord() {

        final int LENGTH = publicToken.getText().length();

        listener.updateCurrentOffset(LENGTH, LENGTH);

        assertEquals("offset should stay the same", 0, listener.getCurrentOffset());
    }

    @Test
    public void testUpdateCurrentOffsetForMultipleSameWords() {

        final int LENGTH = publicToken.getText().length();

        listener.updateCurrentOffset(LENGTH, LENGTH);
        listener.updateCurrentOffset(LENGTH, LENGTH);
        listener.updateCurrentOffset(LENGTH, LENGTH);

        assertEquals("offset should stay the same", 0, listener.getCurrentOffset());
    }

    @Test
    public void testUpdateCurrentOffsetForShorterWord() {

        final int LENGTH = publicToken.getText().length();

        listener.updateCurrentOffset(LENGTH, LENGTH - 3);

        assertEquals("offset should decrease", -3, listener.getCurrentOffset());
    }

    @Test
    public void testUpdateCurrentOffsetForMultipleShorterWords() {

        final int LENGTH = publicToken.getText().length();

        listener.updateCurrentOffset(LENGTH, LENGTH - 1);
        listener.updateCurrentOffset(LENGTH, LENGTH - 2);
        listener.updateCurrentOffset(LENGTH, LENGTH - 3);

        assertEquals("offset should decrease", -3, listener.getCurrentOffset());
    }

    @Test
    public void testUpdateActualStartIndexWithNoOffset() {

        final int START_INDEX = publicToken.getStartIndex();

        listener.updateActualStartIndex(0, START_INDEX);

        assertEquals("with no offset the current and actual start indices should be equal.",
                START_INDEX, listener.getActualStartIndex());
    }

    @Test
    public void testUpdateActualStartIndexWithPositiveOffset() {

        final int START_INDEX = publicToken.getStartIndex();
        final int OLD_OFFSET = 5;

        listener.updateActualStartIndex(OLD_OFFSET, START_INDEX);

        assertEquals("with a positive offset the actual start index should be equal to the current index plus the old offset.",
                START_INDEX + OLD_OFFSET, listener.getActualStartIndex());
    }

    @Test
    public void testUpdateActualStartIndexWithNegativeOffset() {

        final int START_INDEX = staticToken.getStartIndex();
        final int OLD_OFFSET = -5;

        listener.updateActualStartIndex(OLD_OFFSET, START_INDEX);

        assertEquals("with a negative offset the actual start index should be equal to the current index plus the old offset.",
                START_INDEX + OLD_OFFSET, listener.getActualStartIndex());
    }

    @Test
    public void testUpdateActualStartIndexWithNegativeOffsetAndZeroCurrentIndex() {

        listener.updateActualStartIndex(-5, 0);

        assertThat("a negative offset and a current index of 0 should not a negative actual index.",
                listener.getActualStartIndex(), lessThan(0));
    }

    @Test
    public void testUpdateActualStartIndexWithNegativeCurrentIndex() {

        listener.updateActualStartIndex(0, -5);

        assertThat("a negative current index should produce a negative actual index.",
                listener.getActualStartIndex(), lessThan(0));
    }

    @Test
    public void testUpdateActualStopIndexWithNoOffset() {

        final int LENGTH = publicToken.getText().length();

        listener.updateActualLength(0, LENGTH);

        assertEquals("with no offset the current and actual stop indices should be equal.",
                LENGTH, listener.getActualLength());
    }

    @Test
    public void testUpdateActualStopIndexWithPositiveOffset() {

        final int LENGTH = publicToken.getText().length();
        final int CURRENT_OFFSET = 5;

        listener.updateActualLength(CURRENT_OFFSET, LENGTH);

        assertEquals("with a positive offset the actual stop index should be equal to the current index plus the offset.",
                CURRENT_OFFSET + LENGTH, listener.getActualLength());
    }

    @Test
    public void testUpdateActualStopIndexWithNegativeOffset() {

        final int LENGTH = publicToken.getText().length();
        final int CURRENT_OFFSET = -5;

        listener.updateActualLength(CURRENT_OFFSET, LENGTH);

        assertEquals("with a negative offset the actual stop index should be equal to the current index plus the offset.",
                CURRENT_OFFSET + LENGTH, listener.getActualLength());
    }

    @Test
    public void testUpdateActualStopIndexWithNegativeOffsetAndZeroCurrentIndex() {

        final int LENGTH = 0;
        final int CURRENT_OFFSET = -5;

        listener.updateActualLength(CURRENT_OFFSET, LENGTH);

        assertThat("a negative offset and a current index of 0 should produce a negative actual index.",
                listener.getActualLength(), lessThan(0));
    }

    @Test
    public void testUpdateActualStopIndexWithNegativeCurrentIndex() {

        final int LENGTH = -5;
        final int CURRENT_OFFSET = 0;

        listener.updateActualLength(CURRENT_OFFSET, LENGTH);

        assertThat("a negative current index should produce a negative actual index.",
                listener.getActualLength(), lessThan(0));
    }

    @Test
    public void testApplyTransformationToMainStringWithNoOffset() {

        listener.applyTransformationToMainString(publicToken.getStartIndex(), publicToken.getText().length(),
                publicToken.getText() + "12345");

        assertEquals("public12345 static void main() {}", listener.toString());
    }

    @Test
    public void testApplyTransformationToMainStringWithPositiveCurrentOffset() {

        listener.applyTransformationToMainString(publicToken.getStartIndex(), publicToken.getText().length(),
                publicToken.getText() + "12345");

        listener.applyTransformationToMainString(publicToken.getStartIndex(), publicToken.getText().length() + 5,
                publicToken.getText() + "123");

        assertEquals("public123 static void main() {}", listener.toString());
    }

    @Test
    public void testApplyTransformationToMainStringWithPositiveOldOffset() {

        listener.applyTransformationToMainString(publicToken.getStartIndex(), publicToken.getText().length(),
                publicToken.getText() + "12345");

        listener.applyTransformationToMainString(staticToken.getStartIndex() + 5, staticToken.getText().length(),
                staticToken.getText() + "123");

        assertEquals("public12345 static123 void main() {}", listener.toString());
    }

    @Test
    public void testApplyTransformationToMainStringWithPositiveOldOffsetAndNegativeCurrentOffset() {

        listener.applyTransformationToMainString(publicToken.getStartIndex(), publicToken.getText().length(),
                publicToken.getText() + "12345");

        listener.applyTransformationToMainString(staticToken.getStartIndex() + 5, staticToken.getText().length(),
                staticToken.getText() + "123");

        listener.applyTransformationToMainString(staticToken.getStartIndex() + 5, staticToken.getText().length() + 3,
                staticToken.getText() + "1");

        assertEquals("public12345 static1 void main() {}", listener.toString());
    }

    @Test
    public void testTransformSubstringWithTransformationsOnStatic() {

        final String subString = staticToken.getText();

        listener.transformNamedToken(WRAPPING_TYPE_DECLARATION, STATIC_START_INDEX, subString);
        listener.transformNamedToken(WRAPPING_MODIFIER, STATIC_START_INDEX, subString);
        listener.transformNamedToken(WRAPPING_STATIC, STATIC_START_INDEX, subString);

        assertEquals("the transformed string should be correct.", TRANSFORMED_STATIC_TEXT,
                listener.toString());
    }

    @Test
    public void testTransformSubstringWithTransformationsOnPublicStaticVoidAndMain() {

        final String publicSubString = publicToken.getText();

        listener.transformNamedToken(WRAPPING_TYPE_DECLARATION, PUBLIC_START_INDEX, publicSubString);
        listener.transformNamedToken(WRAPPING_CLASS_OR_INTERFACE_MODIFIER, PUBLIC_START_INDEX,
                publicSubString);
        listener.transformNamedToken(WRAPPING_PUBLIC, PUBLIC_START_INDEX, publicSubString);

        final String staticSubString = staticToken.getText();

        listener.transformNamedToken(WRAPPING_TYPE_DECLARATION, STATIC_START_INDEX, staticSubString);
        listener.transformNamedToken(WRAPPING_MODIFIER, STATIC_START_INDEX, staticSubString);
        listener.transformNamedToken(WRAPPING_STATIC, STATIC_START_INDEX, staticSubString);

        listener.transformNamedToken(WRAPPING_VOID, VOID_START_INDEX, voidToken.getText());

        final Token mainToken = mock(Token.class);
        when(mainToken.getStartIndex()).thenReturn(19);
        when(mainToken.getStopIndex()).thenReturn(22);
        when(mainToken.getText()).thenReturn("main");

        listener.transformNamedToken(WRAPPING_METHOD_DEFINITION, mainToken.getStartIndex(),
                mainToken.getText());

        assertEquals("the transformed string should be correct.", TRANSFORMED_PUBLIC_AND_STATIC_TEXT,
                listener.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testTransformSubstringWithNullTransformation() {

        final String publicSubString = publicToken.getText();

        listener.transformNamedToken(null, PUBLIC_START_INDEX,
                publicSubString);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformSubstringWithNullSubString() {

        listener.transformNamedToken(WRAPPING_METHOD_DEFINITION, PUBLIC_START_INDEX,
                null);
    }

    @Test
    public void testTransformSubstringWithInverseIndices() {

        final String publicSubString = publicToken.getText();

        listener.transformNamedToken(WRAPPING_METHOD_DEFINITION, PUBLIC_STOP_INDEX,
                publicSubString);
    }

    @Test
    public void testLength() {

        assertEquals("the initial length should be the same as the wrapped string.", TEST_TEXT.length(),
                listener.length());
    }

    @Test
    public void testLengthAfterTransformation() {

        final String publicSubString = publicToken.getText();

        listener.transformNamedToken(WRAPPING_TYPE_DECLARATION, PUBLIC_START_INDEX, publicSubString);

        assertThat("the length should be different to the wrapped string after a transformation.", listener.length(),
                not(TEST_TEXT.length()));
    }

    @Test
    public void testCharAt() {

        final int INDEX = 20;

        assertEquals("char should be the same as the wrapped string.", TEST_TEXT.charAt(INDEX), listener.charAt(INDEX));
    }

    @Test
    public void testCharAtAfterTransformation() {

        final String publicSubString = publicToken.getText();

        listener.transformNamedToken(WRAPPING_TYPE_DECLARATION, PUBLIC_START_INDEX, publicSubString);

        final int INDEX = 20;

        assertThat("char should be different to the wrapped string after a transformation.", listener.charAt(INDEX),
                not(TEST_TEXT.charAt(INDEX)));
    }

    @Test
    public void testSubString() {

        final int START = 10;
        final int END = 20;

        assertEquals("sub-sequence should be the same as the wrapped string.", TEST_TEXT.subSequence(START, END),
                listener.subSequence(START, END));
    }

    @Test
    public void testSubStringAfterTransformation() {

        final String publicSubString = publicToken.getText();

        listener.transformNamedToken(WRAPPING_TYPE_DECLARATION, PUBLIC_START_INDEX, publicSubString);

        final int START = 10;
        final int END = 20;

        assertThat("sub-sequence should be different to the wrapped string after a transformation.",
                listener.subSequence(START, END), not(TEST_TEXT.subSequence(START, END)));
    }
}
