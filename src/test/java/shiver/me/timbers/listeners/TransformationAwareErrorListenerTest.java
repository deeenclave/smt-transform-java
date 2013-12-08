package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.JavaParser;
import shiver.me.timbers.types.Public;

import java.util.BitSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static shiver.me.timbers.JavaParser.*;
import static shiver.me.timbers.TestData.TRANSFORMATIONS;

/**
 * @author Karl Bennett
 */
public class TransformationAwareErrorListenerTest {

    private static final int LINE = 1;
    private static final int CHAR_POSITION_IN_LINE = 100;
    private static final String MESSAGE = "Test error message.";
    private static final int START_INDEX = 10;
    private static final int STOP_INDEX = 20;
    private static final boolean EXACT = true;
    private static final int PREDICTION = 42;

    private ANTLRErrorListener mockListener;
    private Parser recognizer;
    private Token token;
    private RecognitionException exception;
    private DFA dfa;
    private BitSet bitSet;
    private ATNConfigSet configs;

    @Before
    public void setUp() {

        mockListener = mock(ANTLRErrorListener.class);
        recognizer = spy(new JavaParser(null));

        token = mock(Token.class);

        exception = mock(RecognitionException.class);
        dfa = mock(DFA.class);
        bitSet = mock(BitSet.class);
        configs = mock(ATNConfigSet.class);
    }

    @Test
    public void testCreate() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullListener() {

        new TransformationAwareErrorListener(null, TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullCommentTypes() {

        new TransformationAwareErrorListener(mockListener, null);
    }

    @Test
    public void testSyntaxError() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);

        verify(mockListener, times(1)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test
    public void testSyntaxErrorWithRecognisedType() {

        when(token.getType()).thenReturn(PUBLIC);

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);

        verify(mockListener, times(0)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test(expected = NullPointerException.class)
    public void testSyntaxErrorWithNullRecognizer() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .syntaxError(null, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test(expected = NullPointerException.class)
    public void testSyntaxErrorWithNullToken() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .syntaxError(recognizer, null, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test
    public void testSyntaxErrorWithNullMessage() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, null, exception);

        verify(mockListener, times(1)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, null, exception);
    }

    @Test
    public void testSyntaxErrorWithNullException() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, null);

        verify(mockListener, times(1)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, null);
    }

    @Test
    public void testReportAmbiguity() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);
    }

    @Test
    public void testReportAmbiguityWithNullRecognizer() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAmbiguity(null, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);

        verify(mockListener, times(1)).reportAmbiguity(null, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);
    }

    @Test
    public void testReportAmbiguityWithNullDfa() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAmbiguity(recognizer, null, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, null, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);
    }

    @Test
    public void testReportAmbiguityWithNullBitSet() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, null, configs);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, null, configs);
    }

    @Test
    public void testReportAmbiguityWithNullConfigs() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, null);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, null);
    }

    @Test
    public void testReportAttemptingFullContext() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullRecognizer() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAttemptingFullContext(null, dfa, START_INDEX, STOP_INDEX, bitSet, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(null, dfa, START_INDEX, STOP_INDEX, bitSet, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullDfa() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAttemptingFullContext(recognizer, null, START_INDEX, STOP_INDEX, bitSet, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, null, START_INDEX, STOP_INDEX, bitSet, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullBitSet() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, null, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, null, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullConfigs() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, null);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, null);
    }

    @Test
    public void testReportContextSensitivity() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);

        verify(mockListener, times(1))
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);
    }

    @Test
    public void testReportContextSensitivityWithNullRecognizer() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportContextSensitivity(null, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);

        verify(mockListener, times(1))
                .reportContextSensitivity(null, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);
    }

    @Test
    public void testReportContextSensitivityWithNullDfa() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportContextSensitivity(recognizer, null, START_INDEX, STOP_INDEX, PREDICTION, configs);

        verify(mockListener, times(1))
                .reportContextSensitivity(recognizer, null, START_INDEX, STOP_INDEX, PREDICTION, configs);
    }

    @Test
    public void testReportContextSensitivityWithNullConfigs() {

        new TransformationAwareErrorListener(mockListener, TRANSFORMATIONS)
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, null);

        verify(mockListener, times(1))
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, null);
    }
}
