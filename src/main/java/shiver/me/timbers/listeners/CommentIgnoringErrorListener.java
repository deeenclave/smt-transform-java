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

import java.util.BitSet;
import java.util.Set;

import static shiver.me.timbers.Asserts.assertIsNotNull;

/**
 * This console error listener will not register an error if the error token is for a comment type.
 *
 * @author Karl Bennett
 */
public class CommentIgnoringErrorListener implements ANTLRErrorListener {

    private final ANTLRErrorListener listener;
    private final Set<Integer> commentTypes;

    public CommentIgnoringErrorListener(ANTLRErrorListener listener, Set<Integer> commentTypes) {

        assertIsNotNull(CommentIgnoringErrorListener.class.getSimpleName() + " listener argument cannot be null.",
                listener);
        assertIsNotNull(CommentIgnoringErrorListener.class.getSimpleName() + " commentTypes argument cannot be null.",
                commentTypes);

        this.listener = listener;
        this.commentTypes = commentTypes;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {

        final int type = ((Token) offendingSymbol).getType();

        if (commentTypes.contains(type)) {

            return;
        }

        listener.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
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
