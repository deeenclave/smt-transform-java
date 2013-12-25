package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.TransformableString;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.transform.Transformations;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static shiver.me.timbers.Asserts.assertIsNotNull;

/**
 * This parse tree listener will apply any supplied transformations to related tokens exposed in the listener methods.
 */
public class TransformingParseTreeListener implements ParseTreeListener {

    private static final Transformations EMPTY_TRANSFORMATIONS = new IndividualTransformations(
            Collections.<Transformation>emptySet());

    private final Recognizer recognizer;
    private final Transformations transformations;
    private Transformations parentRuleTransformations;
    private final TransformableString transformableString;

    private final Set<String> transformedTokens;

    public TransformingParseTreeListener(Recognizer recognizer, Transformations transformations,
                                         TransformableString transformableString) {

        this(recognizer, transformations, EMPTY_TRANSFORMATIONS, transformableString);
    }

    /**
     * The {@code parentRuleTransformations} argument in this constructor should contain any transformations that should
     * be run for the parent rule of a terminal token. That is when a token is passed to
     * {@link #visitTerminal(TerminalNode)} it's parent rules name will be passed to the
     * {@link Transformations#get(String)} method of the {@code parentRuleTransformations} and the resulting
     * transformation will be applied to that token.
     */
    public TransformingParseTreeListener(Recognizer recognizer, Transformations transformations,
                                         Transformations parentRuleTransformations,
                                         TransformableString transformableString) {

        assertIsNotNull(Transformations.class.getSimpleName() + " recognizer argument cannot be null.",
                recognizer);
        assertIsNotNull(Transformations.class.getSimpleName() + " transformations argument cannot be null.",
                transformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " parentRuleTransformations argument cannot be null.",
                parentRuleTransformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " string argument cannot be null.", transformableString);

        this.transformableString = transformableString;
        this.transformations = transformations;
        this.parentRuleTransformations = parentRuleTransformations;
        this.recognizer = recognizer;

        this.transformedTokens = new HashSet<String>();
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {

        final RuleContext context = (RuleContext) node.getParent().getPayload();

        final Token token = node.getSymbol();

        transformToken(transformations, token);

        transformRule(parentRuleTransformations, context, token);
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {

        final Token token = node.getSymbol();

        transformToken(transformations, token);
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
