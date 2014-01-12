package shiver.me.timbers.transform.java;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.CompoundTransformations;
import shiver.me.timbers.transform.antlr4.IterableTokenTransformations;
import shiver.me.timbers.transform.antlr4.TokenApplier;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.java.rules.ClassDeclaration;
import shiver.me.timbers.transform.java.rules.MethodDeclaration;
import shiver.me.timbers.transform.java.types.Const;
import shiver.me.timbers.transform.java.types.Goto;
import shiver.me.timbers.transform.java.types.Strictfp;
import shiver.me.timbers.transform.language.test.WrappingTokenApplier;

import java.util.Arrays;
import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static shiver.me.timbers.transform.java.Comments.COMMENT_NAMES;
import static shiver.me.timbers.transform.java.KeyWords.KEYWORD_NAMES;
import static shiver.me.timbers.transform.language.test.TransformationsUtils.buildWrappingTransformationsFromPackageName;

public final class TransformationsConstants {

    private TransformationsConstants() {
    }

    public static final TokenApplier MOCK_APPLIER = mock(TokenApplier.class);

    public static final String TYPES_PACKAGE_NAME = "shiver.me.timbers.transform.java.types";
    public static final String RULES_PACKAGE_NAME = "shiver.me.timbers.transform.java.rules";

    public static final Transformations<TokenTransformation> TYPES_TRANSFORMATIONS =
            new IterableTokenTransformations(buildWrappingTransformationsFromPackageName(TYPES_PACKAGE_NAME));

    public static final Transformations<TokenTransformation> RULES_TRANSFORMATIONS =
            new IterableTokenTransformations(buildWrappingTransformationsFromPackageName(RULES_PACKAGE_NAME));

    public static final Transformations<TokenTransformation> DEFINITION_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    Arrays.<TokenTransformation>asList(
                            new CompositeTokenTransformation(ClassDeclaration.NAME,
                                    new IdentifierApplier(new WrappingTokenApplier("classDefinition"))),
                            new CompositeTokenTransformation(MethodDeclaration.NAME,
                                    new IdentifierApplier(new WrappingTokenApplier("methodDefinition")))
                    )
            );

    @SuppressWarnings("unchecked")
    public static final Transformations<TokenTransformation> ALL_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    new LinkedList<TokenTransformation>() {{
                        addAll(TYPES_TRANSFORMATIONS.asCollection());
                        addAll(RULES_TRANSFORMATIONS.asCollection());
                        addAll(DEFINITION_TRANSFORMATIONS.asCollection());
                    }}
            );

    public static final Transformations<TokenTransformation> UNUSED_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    Arrays.<TokenTransformation>asList(
                            new Const(MOCK_APPLIER),
                            new Goto(MOCK_APPLIER),
                            new Strictfp(MOCK_APPLIER)
                    )
            );

    public static final Transformations<TokenTransformation> KEYWORD_TRANSFORMATIONS =
            new CompoundTransformations(KEYWORD_NAMES, new WrappingTokenApplier("KEYWORD"));

    public static final Transformations<TokenTransformation> COMMENT_TRANSFORMATIONS =
            new CompoundTransformations(COMMENT_NAMES, new WrappingTokenApplier("COMMENT"));

    private static class IdentifierApplier implements TokenApplier {

        private final TokenApplier applier;

        private IdentifierApplier(TokenApplier applier) {

            this.applier = applier;
        }

        @Override
        public String apply(RuleContext context, Token token, String string) {

            return isIdentifier(token) ? this.applier.apply(context, token, string) : string;
        }

        private static boolean isIdentifier(Token token) {

            return "Identifier".equals(JavaParser.tokenNames[token.getType()]);
        }
    }
}
