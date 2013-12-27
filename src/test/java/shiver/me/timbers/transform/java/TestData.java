package shiver.me.timbers.transform.java;

import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;
import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;
import shiver.me.timbers.transform.CompoundTransformations;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.java.rules.ClassDeclaration;
import shiver.me.timbers.transform.java.rules.MethodDeclaration;
import shiver.me.timbers.transform.java.types.Const;
import shiver.me.timbers.transform.java.types.Goto;
import shiver.me.timbers.transform.java.types.Strictfp;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static shiver.me.timbers.transform.java.Comments.COMMENT_NAMES;
import static shiver.me.timbers.transform.java.KeyWords.KEYWORD_NAMES;

public final class TestData {

    private TestData() {
    }

    public static final String TEST_FILE_NAME = "Test.java";
    public static final String INVALID_TEST_FILE_NAME = "InvalidTest.javor";
    public static final String TRANSFORMED_TEST_FILE_NAME = "Test.java.transformed";
    public static final String TRANSFORMED_KEYWORDS_TEST_FILE_NAME = "Test.java.keywords";
    public static final String TRANSFORMED_COMMENTS_TEST_FILE_NAME = "Test.java.comments";
    public static final String TRANSFORMED_INVALID_TEST_FILE_NAME = "InvalidTest.javor.transformed";
    public static final String TRANSFORMED_TYPES_TEST_FILE_NAME = "Test.java.types";
    public static final String TRANSFORMED_RULES_TEST_FILE_NAME = "Test.java.rules";

    public static final Applyer MOCK_APPLYER = mock(Applyer.class);

    private static final Reflections TYPE_TRANSFORMATION_REFECTIONS = buildReflections("shiver.me.timbers.transform.java.type");
    private static final Reflections RULE_TRANSFORMATION_REFECTIONS = buildReflections("shiver.me.timbers.transform.java.rules");

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

    public static final Transformations TYPES_TRANSFORMATIONS = new IndividualTransformations(
            buildTransformations(TYPE_TRANSFORMATION_CLASSES));
    public static final Transformations RULES_TRANSFORMATIONS = new IndividualTransformations(
            buildTransformations(RULE_TRANSFORMATION_CLASSES));

    public static final Transformations ALL_TRANSFORMATIONS = new IndividualTransformations(
            Arrays.<Iterable<Transformation>>asList(
                    TYPES_TRANSFORMATIONS,
                    RULES_TRANSFORMATIONS
            )
    );

    public static final Transformations KEYWORD_TRANSFORMATIONS = new CompoundTransformations(KEYWORD_NAMES,
            new WrappingApplyer("KEYWORD"));

    public static final Transformations COMMENT_TRANSFORMATIONS = new CompoundTransformations(COMMENT_NAMES,
            new WrappingApplyer("COMMENT"));

    public static final Transformations PARENT_TRANSFORMATIONS = new IndividualTransformations(
            Arrays.<Transformation>asList(
                    new CompositeTransformation(ClassDeclaration.NAME, new Applyer() {

                        private boolean isClassName(String string) {

                            for (String name : JavaParser.tokenNames) {

                                if (!"Identifier".equals(name) && string.contains('[' + name + ']')) {

                                    return false;
                                }
                            }

                            return true;
                        }

                        @Override
                        public String apply(String string) {

                            return isClassName(string) ? new WrappingApplyer("classDefinition").apply(string) : string;
                        }
                    }),
                    new CompositeTransformation(MethodDeclaration.NAME, new Applyer() {

                        @Override
                        public String apply(String string) {

                            return string.equals(";") ? string : new WrappingApplyer("methodDefinition").apply(string);
                        }
                    })
            ));

    public static final String SOURCE = readTestFileToString(TEST_FILE_NAME);
    public static final String TRANSFORMED_SOURCE = readTestFileToString(TRANSFORMED_TEST_FILE_NAME);
    public static final String TRANSFORMED_KEYWORDS_SOURCE = readTestFileToString(TRANSFORMED_KEYWORDS_TEST_FILE_NAME);
    public static final String TRANSFORMED_COMMENTS_SOURCE = readTestFileToString(TRANSFORMED_COMMENTS_TEST_FILE_NAME);
    public static final String TRANSFORMED_INVALID_SOURCE = readTestFileToString(TRANSFORMED_INVALID_TEST_FILE_NAME);
    public static final String TRANSFORMED_TYPES_SOURCE = readTestFileToString(TRANSFORMED_TYPES_TEST_FILE_NAME);
    public static final String TRANSFORMED_RULES_SOURCE = readTestFileToString(TRANSFORMED_RULES_TEST_FILE_NAME);

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

        final Set<Class<? extends CompositeTransformation>> allTypeTransformationClasses = reflections.getSubTypesOf(CompositeTransformation.class);

        final List<Class<Transformation>> typeTransformationsClasses =
                new ArrayList<Class<Transformation>>(allTypeTransformationClasses.size());

        for (Class type : allTypeTransformationClasses) {

            typeTransformationsClasses.add((Class<Transformation>) type);
        }

        return Collections.unmodifiableList(typeTransformationsClasses);
    }

    private static List<Transformation> buildTransformations(List<Class<Transformation>> classes) {

        List<Transformation> transformations = new ArrayList<Transformation>(classes.size());

        for (Class<Transformation> type : classes) {

            transformations.add(buildTransformation(type));
        }

        return transformations;
    }

    private static Transformation buildTransformation(Class<Transformation> type) {

        try {

            Constructor<Transformation> constructor = type.getConstructor(Applyer.class);
            Field field = type.getField("NAME");

            String name = field.get(null).toString();

            return constructor.newInstance(new WrappingApplyer(name));

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
