package shiver.me.timbers.transform.java;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;
import shiver.me.timbers.transform.antlr4.TokenTransformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RuleAndTokenTest {

    private static final String APPLY_STRING = "test apply string.";

    @Test
    public void testAllTypeTransformations() throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        transformationsTest(TestData.TYPE_TRANSFORMATION_CLASSES);
    }

    @Test
    public void testAllRuleTransformations() throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        transformationsTest(TestData.RULE_TRANSFORMATION_CLASSES);
    }

    public void transformationsTest(List<Class<TokenTransformation>> transformationTypes) throws InvocationTargetException,
            NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        for (Class<TokenTransformation> type : transformationTypes) {

            TokenApplier mockApplier = buildMockApplier();

            TokenTransformation transformation = newTransformation(type, mockApplier);

            assertEquals(staticName(transformation), transformation.getName());

            assertEquals(APPLY_STRING, transformation.apply(mock(RuleContext.class), mock(Token.class), APPLY_STRING));

            verify(mockApplier, times(1)).apply(any(RuleContext.class), any(Token.class), eq(APPLY_STRING));
        }
    }

    private static TokenApplier buildMockApplier() {

        final TokenApplier mockApplier = mock(TokenApplier.class);
        when(mockApplier.apply(any(RuleContext.class), any(Token.class), eq(APPLY_STRING))).thenReturn(APPLY_STRING);

        return mockApplier;
    }

    private static TokenTransformation newTransformation(Class<TokenTransformation> type, TokenApplier applier)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        final Constructor<TokenTransformation> constructor = type.getConstructor(TokenApplier.class);

        return constructor.newInstance(applier);
    }

    private static String staticName(Transformation transformation) throws NoSuchFieldException,
            IllegalAccessException {

        final Field staticName = transformation.getClass().getField("NAME");

        return staticName.get(null).toString();
    }
}
