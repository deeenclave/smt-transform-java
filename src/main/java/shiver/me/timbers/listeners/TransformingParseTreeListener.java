package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import shiver.me.timbers.transform.TransformableString;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.transform.Transformations;

import java.util.HashSet;
import java.util.Set;

import static shiver.me.timbers.Asserts.assertIsNotNull;

public class TransformingParseTreeListener implements ParseTreeListener {

    private final Recognizer recognizer;
    private final Transformations transformations;
    private final Transformations parentTransformations;
    private final Transformations errorTransformations;
    private final TransformableString transformableString;

    private final Set<String> transformedTokens;

    public TransformingParseTreeListener(Recognizer recognizer, Transformations transformations,
                                         Transformations parentTransformations, Transformations errorTransformations,
                                         TransformableString transformableString) {

        assertIsNotNull(Transformations.class.getSimpleName() + " recognizer argument cannot be null.",
                recognizer);
        assertIsNotNull(Transformations.class.getSimpleName() + " transformations argument cannot be null.",
                transformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " parentTransformations argument cannot be null.",
                parentTransformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " errorTransformations argument cannot be null.",
                errorTransformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " string argument cannot be null.", transformableString);

        this.transformableString = transformableString;
        this.transformations = transformations;
        this.parentTransformations = parentTransformations;
        this.errorTransformations = errorTransformations;
        this.recognizer = recognizer;

        this.transformedTokens = new HashSet<String>();
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {

        final RuleContext context = (RuleContext) node.getParent().getPayload();

        final Token token = node.getSymbol();

        transformToken(transformations, token);

        transformRule(parentTransformations, context, token);
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {

        final Token token = node.getSymbol();

        transformToken(errorTransformations, token);
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext context) {

        final Token token = context.getStart();

        transformToken(transformations, token);

        transformRule(transformations, context, token);
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext context) {
    }

    private void transformRule(Transformations transformations, RuleContext context, Token token) {

        final Transformation transformation = transformations.get(getRuleName(context.getRuleIndex()));

        transformableString.transformSubstring(transformation, token.getStartIndex(), token.getStopIndex());
    }

    private String getRuleName(int rule) {

        return recognizer.getRuleNames()[rule];
    }

    private void transformToken(Transformations transformations, Token token) {

        if (isValidTokenType(token) && tokenHasNotBeenPrinted(token)) {

            final Transformation transformation = transformations.get(getTokenName(token.getType()));

            transformableString.transformSubstring(transformation, token.getStartIndex(), token.getStopIndex());

            registerTokenAsPrinted(token);
        }
    }

    private boolean isValidTokenType(Token token) {

        return 0 <= token.getType();
    }

    private boolean tokenHasNotBeenPrinted(Token token) {

        return !transformedTokens.contains(token.toString());
    }

    private void registerTokenAsPrinted(Token token) {

        transformedTokens.add(token.toString());
    }

    private String getTokenName(int type) {

        return recognizer.getTokenNames()[type];
    }

    @Override
    public String toString() {

        return transformableString.toString();
    }
}
