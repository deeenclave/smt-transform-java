package shiver.me.timbers.transform.java;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;
import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.CompoundTransformations;
import shiver.me.timbers.transform.antlr4.TokenApplier;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
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
import static shiver.me.timbers.transform.antlr4.NullTokenTransformation.NULL_TOKEN_TRANSFORMATION;
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

    public static final TokenApplier MOCK_APPLIER = mock(TokenApplier.class);

    private static final Reflections TYPE_TRANSFORMATION_REFECTIONS = buildReflections("shiver.me.timbers.transform.java.type");
    private static final Reflections RULE_TRANSFORMATION_REFECTIONS = buildReflections("shiver.me.timbers.transform.java.rules");

    public static final List<Class<TokenTransformation>> TYPE_TRANSFORMATION_CLASSES =
            allTransformations(TYPE_TRANSFORMATION_REFECTIONS);
    public static final List<Class<TokenTransformation>> RULE_TRANSFORMATION_CLASSES =
            allTransformations(RULE_TRANSFORMATION_REFECTIONS);

    public static final Transformations<TokenTransformation> EMPTY_TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(Collections.<TokenTransformation>emptyList(),
                    NULL_TOKEN_TRANSFORMATION);

    public static final Transformations<TokenTransformation> UNUSED_TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(
                    Arrays.<TokenTransformation>asList(
                            new Const(MOCK_APPLIER),
                            new Goto(MOCK_APPLIER),
                            new Strictfp(MOCK_APPLIER)
                    ),
                    NULL_TOKEN_TRANSFORMATION
            );

    public static final Transformations<TokenTransformation> TYPES_TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(
                    buildTransformations(TYPE_TRANSFORMATION_CLASSES), NULL_TOKEN_TRANSFORMATION);
    public static final Transformations<TokenTransformation> RULES_TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(
                    buildTransformations(RULE_TRANSFORMATION_CLASSES), NULL_TOKEN_TRANSFORMATION);

    @SuppressWarnings("unchecked")
    public static final Transformations<TokenTransformation> ALL_TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(
                    Arrays.<Iterable<TokenTransformation>>asList(
                            TYPES_TRANSFORMATIONS,
                            RULES_TRANSFORMATIONS
                    ), NULL_TOKEN_TRANSFORMATION);

    public static final Transformations<TokenTransformation> KEYWORD_TRANSFORMATIONS = new CompoundTransformations(KEYWORD_NAMES,
            new WrappingApplier("KEYWORD"));

    public static final Transformations<TokenTransformation> COMMENT_TRANSFORMATIONS = new CompoundTransformations(COMMENT_NAMES,
            new WrappingApplier("COMMENT"));

    public static final Transformations<TokenTransformation> PARENT_TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(
                    Arrays.<TokenTransformation>asList(
                            new CompositeTokenTransformation(ClassDeclaration.NAME,
                                    new IdentifierWrappingApplier("classDefinition")),
                            new CompositeTokenTransformation(MethodDeclaration.NAME,
                                    new IdentifierWrappingApplier("methodDefinition"))
                    ), NULL_TOKEN_TRANSFORMATION);

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
    private static List<Class<TokenTransformation>> allTransformations(Reflections reflections) {

        final Set<Class<? extends CompositeTokenTransformation>> allTypeTransformationClasses =
                reflections.getSubTypesOf(CompositeTokenTransformation.class);

        final List<Class<TokenTransformation>> typeTransformationsClasses =
                new ArrayList<Class<TokenTransformation>>(allTypeTransformationClasses.size());

        for (Class type : allTypeTransformationClasses) {

            typeTransformationsClasses.add((Class<TokenTransformation>) type);
        }

        return Collections.unmodifiableList(typeTransformationsClasses);
    }

    private static List<TokenTransformation> buildTransformations(List<Class<TokenTransformation>> classes) {

        List<TokenTransformation> transformations = new ArrayList<TokenTransformation>(classes.size());

        for (Class<TokenTransformation> type : classes) {

            transformations.add(buildTransformation(type));
        }

        return transformations;
    }

    private static TokenTransformation buildTransformation(Class<TokenTransformation> type) {

        try {

            Constructor<TokenTransformation> constructor = type.getConstructor(TokenApplier.class);
            Field field = type.getField("NAME");

            String name = field.get(null).toString();

            return constructor.newInstance(new WrappingApplier(name));

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

    private static class WrappingApplier implements TokenApplier {

        private final String name;

        private WrappingApplier(String name) {

            this.name = name;
        }

        @Override
        public String apply(RuleContext context, Token token, String string) {

            return '[' + name + ']' + string + '[' + name + ']';
        }
    }

    private static class IdentifierWrappingApplier extends WrappingApplier {

        private IdentifierWrappingApplier(String name) {

            super(name);
        }

        @Override
        public String apply(RuleContext context, Token token, String string) {

            return isIdentifier(token) ? super.apply(context, token, string) : string;
        }

        private static boolean isIdentifier(Token token) {

            return "Identifier".equals(JavaParser.tokenNames[token.getType()]);
        }
    }
}
