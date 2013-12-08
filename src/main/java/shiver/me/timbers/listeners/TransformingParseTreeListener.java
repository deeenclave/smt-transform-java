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

import java.util.Map;

/**
 * @author Karl Bennett
 */
public class TransformingParseTreeListener implements ParseTreeListener {

    private final Recognizer recognizer;
    private final Transformations transformations;
    private final Map<Integer, String> customRules;
    private final TransformableString transformableString;

    public TransformingParseTreeListener(Recognizer recognizer, Transformations transformations,
                                         Map<Integer, String> customRules, String string) {

        this.transformableString = new TransformableString(string);
        this.transformations = transformations;
        this.customRules = customRules;
        this.recognizer = recognizer;
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {

        final int ruleType = ((RuleContext) node.getParent().getPayload()).getRuleIndex();

        final Token token = node.getSymbol();

        transformString(customRules.get(ruleType), token);

        if (0 <= token.getType()) {

            transformToken(token);
        }
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {

        transformToken(node.getSymbol());
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext context) {

        transformRule(context);
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext context) {

//        transformRule(context);
    }

    private void transformToken(Token token) {

        transformString(getTokenName(token.getType()), token);
    }

    private void transformRule(ParserRuleContext context) {

        transformString(getRuleName(context.getRuleIndex()), context.getStart());
    }

    private void transformString(String name, Token token) {

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
