package shiver.me.timbers.transform.java;

import org.junit.Test;
import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.Transformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static org.junit.Assert.assertEquals;
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

    public void transformationsTest(List<Class<Transformation>> transformationTypes) throws InvocationTargetException,
            NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        for (Class<Transformation> type : transformationTypes) {

            Applyer mockApplyer = buildMockApplyer();

            Transformation transformation = newTransformation(type, mockApplyer);

            assertEquals(staticName(transformation), transformation.getName());

            assertEquals(APPLY_STRING, transformation.apply(APPLY_STRING));

            verify(mockApplyer, times(1)).apply(APPLY_STRING);
        }
    }

    private static Applyer buildMockApplyer() {

        final Applyer mockApplyer = mock(Applyer.class);
        when(mockApplyer.apply(APPLY_STRING)).thenReturn(APPLY_STRING);

        return mockApplyer;
    }

    private static Transformation newTransformation(Class<Transformation> type, Applyer applyer)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        final Constructor<Transformation> constructor = type.getConstructor(Applyer.class);

        return constructor.newInstance(applyer);
    }

    private static String staticName(Transformation transformation) throws NoSuchFieldException,
            IllegalAccessException {

        final Field staticName = transformation.getClass().getField("NAME");

        return staticName.get(null).toString();
    }
}
