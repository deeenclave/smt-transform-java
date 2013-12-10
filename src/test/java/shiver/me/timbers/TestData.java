package shiver.me.timbers;

import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import shiver.me.timbers.rules.ClassDeclaration;
import shiver.me.timbers.rules.ClassOrInterfaceModifier;
import shiver.me.timbers.rules.ClassOrInterfaceType;
import shiver.me.timbers.rules.ConstructorDeclaration;
import shiver.me.timbers.rules.Literal;
import shiver.me.timbers.rules.MethodDeclaration;
import shiver.me.timbers.rules.Modifier;
import shiver.me.timbers.rules.PackageDeclaration;
import shiver.me.timbers.rules.PrimitiveType;
import shiver.me.timbers.rules.TypeDeclaration;
import shiver.me.timbers.rules.VariableDeclaratorId;
import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.types.Comment;
import shiver.me.timbers.types.Const;
import shiver.me.timbers.types.Goto;
import shiver.me.timbers.types.JavaDoc;
import shiver.me.timbers.types.LineComment;
import shiver.me.timbers.types.Private;
import shiver.me.timbers.types.Public;
import shiver.me.timbers.types.Return;
import shiver.me.timbers.types.Static;
import shiver.me.timbers.types.Strictfp;
import shiver.me.timbers.types.This;
import shiver.me.timbers.types.Void;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;

public final class TestData {

    private TestData() {
    }

    public static final String TEST_FILE_NAME = "Test.java";
    public static final String INVALID_TEST_FILE_NAME = "InvalidTest.javor";
    public static final String TRANSFORMED_TEST_FILE_NAME = "Test.java.transformed";
    public static final String TRANSFORMED_INVALID_TEST_FILE_NAME = "InvalidTest.javor.transformed";

    public static final Applyer MOCK_APPLYER = mock(Applyer.class);

    private static final Reflections TYPE_TRANSFORMATION_REFECTIONS = buildReflections("shiver.me.timbers.type");
    private static final Reflections RULE_TRANSFORMATION_REFECTIONS = buildReflections("shiver.me.timbers.rules");

    public static final List<Class<Transformation>> TYPE_TRANSFORMATION_CLASSES =
            allTransformations(TYPE_TRANSFORMATION_REFECTIONS);
    public static final List<Class<Transformation>> RULE_TRANSFORMATION_CLASSES =
            allTransformations(RULE_TRANSFORMATION_REFECTIONS);

    public static final Transformations EMPTY_TRANSFORMATIONS =
            new IndividualTransformations(Collections.<Transformation>emptyList());

    public static final Transformations UNUSED_TRANSFORMATIONS = new IndividualTransformations(Arrays.<Transformation>asList(
            new Const(MOCK_APPLYER),
            new Goto(MOCK_APPLYER),
            new Strictfp(MOCK_APPLYER)
    ));

    public static final Transformations TRANSFORMATIONS = new IndividualTransformations(
            new ArrayList<Transformation>() {{
                addAll(buildTransformation(TYPE_TRANSFORMATION_CLASSES));
                addAll(buildTransformation(RULE_TRANSFORMATION_CLASSES));
            }});

    public static final Transformations PARENT_TRANSFORMATIONS = new IndividualTransformations(
            Arrays.<Transformation>asList(
                    new CompositeTransformation(ClassDeclaration.NAME, new WrappingApplyer("classDefinition")),
                    new CompositeTransformation(MethodDeclaration.NAME, new WrappingApplyer("methodDefinition"))
            ));

    public static final String SOURCE = readTestFileToString(TEST_FILE_NAME);
    public static final String TRANSFORMED_SOURCE = readTestFileToString(TRANSFORMED_TEST_FILE_NAME);
    public static final String TRANSFORMED_INVALID_SOURCE = readTestFileToString(TRANSFORMED_INVALID_TEST_FILE_NAME);

    /**
     * @return the input stream for the default test file.
     */
    public static InputStream readTestFile() {

        return readTestFile(TEST_FILE_NAME);
    }

    /**
     * @return an input stream for the test file in the {@code shiver.me.timbers} package with the supplied name.
     */
    public static InputStream readTestFile(String fileName) {

        return TestData.class.getResourceAsStream(fileName);
    }

    /**
     * @return a {@code String} containing the contents of the test file in the {@code shiver.me.timbers} package with
     *         the supplied name.
     */
    public static String readTestFileToString(String fileName) {

        try {

            return IOUtils.toString(readTestFile(fileName));

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    private static Reflections buildReflections(String packageName) {

        return new Reflections(packageName);
    }

    @SuppressWarnings("unchecked")
    private static List<Class<Transformation>> allTransformations(Reflections reflections) {

        Set<Class<? extends CompositeTransformation>> allTypeTransformationClasses = reflections.getSubTypesOf(CompositeTransformation.class);

        List<Class<Transformation>> typeTransformationsClasses =
                new ArrayList<Class<Transformation>>(allTypeTransformationClasses.size());

        for (Class<? extends Object> type : allTypeTransformationClasses) {

            typeTransformationsClasses.add((Class<Transformation>) type);
        }

        return Collections.unmodifiableList(typeTransformationsClasses);
    }

    private static List<Transformation> buildTransformation(List<Class<Transformation>> classes) {

        List<Transformation> transformations = new ArrayList<Transformation>(classes.size());

        Constructor<Transformation> constructor;
        Field field;
        String name;
        for (Class<Transformation> type : classes) {

            try {
                constructor = type.getConstructor(Applyer.class);
                field = type.getField("NAME");

                name = field.get(null).toString();

                transformations.add(constructor.newInstance(new WrappingApplyer(name)));

            } catch (NoSuchMethodException e) {

                throw new RuntimeException(e);

            } catch (InvocationTargetException e) {

                throw new RuntimeException(e);

            } catch (InstantiationException e) {

                throw new RuntimeException(e);

            } catch (IllegalAccessException e) {

                throw new RuntimeException(e);

            } catch (NoSuchFieldException e) {

                throw new RuntimeException(e);
            }
        }

        return transformations;
    }

    /**
     * A simple Transformation that wraps the related text with the name of the wrapped Transformation surrounded in square
     * brackets e.g. [type]int[type].
     */
    private static class NameWrappingTransformation extends CompositeTransformation {

        private NameWrappingTransformation(String name) {
            super(name, new WrappingApplyer(name));
        }
    }

    private static class WrappingApplyer implements Applyer {

        private final String name;

        private WrappingApplyer(String name) {

            this.name = name;
        }

        @Override
        public String apply(String string) {

            return '[' + name + ']' + string + '[' + name + ']';
        }
    }
}
