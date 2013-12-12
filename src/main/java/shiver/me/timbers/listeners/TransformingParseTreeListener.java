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

import static shiver.me.timbers.Asserts.assertIsNotNull;

public class TransformingParseTreeListener implements ParseTreeListener {

    private final Recognizer recognizer;
    private final Transformations transformations;
    private final Transformations parentTransformations;
    private final Transformations errorTransformations;
    private final TransformableString transformableString;

    public TransformingParseTreeListener(Recognizer recognizer, Transformations transformations,
                                         Transformations parentTransformations, Transformations errorTransformations,
                                         String string) {

        assertIsNotNull(Transformations.class.getSimpleName() + " recognizer argument cannot be null.",
                recognizer);
        assertIsNotNull(Transformations.class.getSimpleName() + " transformations argument cannot be null.",
                transformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " parentTransformations argument cannot be null.",
                parentTransformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " errorTransformations argument cannot be null.",
                errorTransformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " string argument cannot be null.", string);

        this.transformableString = new TransformableString(string);
        this.transformations = transformations;
        this.parentTransformations = parentTransformations;
        this.errorTransformations = errorTransformations;
        this.recognizer = recognizer;
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {

        final int ruleType = ((RuleContext) node.getParent().getPayload()).getRuleIndex();

        final Token token = node.getSymbol();

        transformString(parentTransformations, getRuleName(ruleType), token);

        final int tokenType = token.getType();

        if (0 <= tokenType) {

            transformString(transformations, getTokenName(tokenType), token);
        }
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {

        final Token token = node.getSymbol();
        final int tokenType = token.getType();

        transformString(errorTransformations, getTokenName(tokenType), token);
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext context) {

        final Token token = context.getStart();
        final int ruleType = context.getRuleIndex();

        transformString(transformations, getRuleName(ruleType), token);
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext context) {
    }

    private void transformString(Transformations transformations, String name, Token token) {

        final Transformation transformation = transformations.get(name);

        transformableString.transformSubstring(transformation, token.getStartIndex(), token.getStopIndex());
    }

    private String getRuleName(int rule) {

        return recognizer.getRuleNames()[rule];
    }

    private String getTokenName(int type) {

        return recognizer.getTokenNames()[type];
    }

    @Override
    public String toString() {

        return transformableString.toString();
    }
}
