package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import shiver.me.timbers.transform.NullTransformation;
import shiver.me.timbers.transform.Transformations;

import java.util.BitSet;

import static shiver.me.timbers.Asserts.assertIsNotNull;

/**
 * This console error listener will not register an error if the error token is for a comment type.
 *
 * @author Karl Bennett
 */
public class TransformationAwareErrorListener implements ANTLRErrorListener {

    private final ANTLRErrorListener listener;
    private final Transformations transformations;

    public TransformationAwareErrorListener(ANTLRErrorListener listener, Transformations transformations) {

        assertIsNotNull(TransformationAwareErrorListener.class.getSimpleName() + " listener argument cannot be null.",
                listener);
        assertIsNotNull(TransformationAwareErrorListener.class.getSimpleName() + " transformations argument cannot be null.",
                transformations);

        this.listener = listener;
        this.transformations = transformations;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {

        final Token token = (Token) offendingSymbol;

        final int type = token.getType();

        if (0 <= type) {

            final String tokenName = recognizer.getTokenNames()[type];

            if (canTransform(tokenName)) {

                return;
            }
        }

        listener.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    }

    private boolean canTransform(String tokenName) {

        return !(transformations.get(tokenName) instanceof NullTransformation);
    }

    @Override
    public void reportAmbiguity(@NotNull Parser recognizer, @NotNull DFA dfa, int startIndex, int stopIndex,
                                boolean exact, @NotNull BitSet ambigAlts, @NotNull ATNConfigSet configs) {

        listener.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    }

    @Override
    public void reportAttemptingFullContext(@NotNull Parser recognizer, @NotNull DFA dfa, int startIndex, int stopIndex,
                                            @Nullable BitSet conflictingAlts, @NotNull ATNConfigSet configs) {

        listener.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
    }

    @Override
    public void reportContextSensitivity(@NotNull Parser recognizer, @NotNull DFA dfa, int startIndex, int stopIndex,
                                         int prediction, @NotNull ATNConfigSet configs) {

        listener.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
    }
}
