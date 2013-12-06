package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;
import shiver.me.timbers.IndividualTransformations;
import shiver.me.timbers.JavaParser;
import shiver.me.timbers.Transformation;
import shiver.me.timbers.Transformations;
import shiver.me.timbers.rules.ClassDeclaration;
import shiver.me.timbers.rules.ClassDefinition;
import shiver.me.timbers.rules.MethodDeclaration;
import shiver.me.timbers.rules.MethodDefinition;

import java.util.Arrays;

import static shiver.me.timbers.Comments.isComment;

/**
 * A parse tree listener that can be used with the {@code ParseTreeWalker#walk(ParseTreeListener, ParseTree)} to run
 * {@link shiver.me.timbers.Transformation}s over some any source code.
 *
 * @author Karl Bennett
 */
public class TransformingParseTreeListener implements ParseTreeListener {

    private static final Transformations TRANSFORMATIONS = new IndividualTransformations(
            Arrays.<Transformation>asList(
                    new CompositeTransformation(ClassDeclaration.NAME, new Applyer() {

                        @Override
                        public String apply(String string) {

                            return ClassDefinition.NAME;
                        }
                    }),
                    new CompositeTransformation(MethodDeclaration.NAME, new Applyer() {

                        @Override
                        public String apply(String string) {

                            return MethodDefinition.NAME;
                        }
                    })
            )
    );

    private final StringBuilder builder;
    private final Transformations transformations;
    private final Parser parser;
    private String replacedWord;

    private int lastWordIndex = -1;
    private int offset = 0;

    public TransformingParseTreeListener(StringBuilder builder, Transformations transformations, Parser parser) {

        this.builder = builder;
        this.transformations = transformations;
        this.parser = parser;
    }

    private void print(String transformationName, Token token) {

        final int startIndex = token.getStartIndex();

        final boolean isNewWord = isNewWord(startIndex);

        if (isNewWord) {

            replacedWord = token.getText();
        }

        Transformation transformation = transformations.get(transformationName);

        final int wordLength = replacedWord.length();
        final int stopIndex = startIndex + wordLength;

        final String newWord = transformation.apply(replacedWord);

        builder.replace(startIndex + (isNewWord ? offset : 0), stopIndex + (isNewWord ? offset : 0), newWord);

        offset += newWord.length() - wordLength;

        replacedWord = newWord;
    }

    private boolean isNewWord(final int currentWordIndex) {

        if (currentWordIndex > lastWordIndex) {

            lastWordIndex = currentWordIndex;

            return true;
        }

        return false;
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) {

        final String ruleName = parser.getRuleNames()[ctx.getRuleIndex()];

        print(ruleName, ctx.start);
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {

        final Token token = node.getSymbol();

        final int type = token.getType();

        if (0 > type) {

            return;
        }

        String tokenName = parser.getTokenNames()[type];

        if (node.getParent() instanceof RuleContext) {

            RuleContext ruleContext = (RuleContext) node.getParent();

            tokenName = TRANSFORMATIONS.get(JavaParser.ruleNames[ruleContext.getRuleIndex()]).apply(tokenName);
        }

        print(tokenName, token);
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {

        final Token token = node.getSymbol();

        final int type = token.getType();

        if (isComment(type)) {

            final String tokenName = parser.getTokenNames()[type];

            print(tokenName, token);
        }
    }
}
