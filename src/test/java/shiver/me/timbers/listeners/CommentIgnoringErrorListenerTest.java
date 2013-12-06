package shiver.me.timbers.listeners;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.Before;
import org.junit.Test;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Karl Bennett
 */
public class CommentIgnoringErrorListenerTest {

    private static final int COMMENT_TYPE_ONE = 1;
    private static final int COMMENT_TYPE_TWO = 2;
    private static final int COMMENT_TYPE_THREE = 3;
    private static final int COMMENT_TYPE_FOUR = 4;

    private static final int LINE = 1;
    private static final int CHAR_POSITION_IN_LINE = 100;
    private static final String MESSAGE = "Test error message.";
    private static final int START_INDEX = 10;
    private static final int STOP_INDEX = 20;
    private static final boolean EXACT = true;
    private static final int PREDICTION = 42;

    private static final Set<Integer> COMMENT_TYPES = new HashSet<Integer>() {{
        add(COMMENT_TYPE_ONE);
        add(COMMENT_TYPE_TWO);
        add(COMMENT_TYPE_THREE);
        add(COMMENT_TYPE_FOUR);
    }};

    private ANTLRErrorListener mockListener;
    private Parser recognizer;
    private Token token;
    private RecognitionException exception;
    private DFA dfa;
    private BitSet bitSet;
    private ATNConfigSet configs;

    @Before
    public void setUp() {

        mockListener = mock(ANTLRErrorListener.class);
        recognizer = mock(Parser.class);
        token = mock(Token.class);
        exception = mock(RecognitionException.class);
        dfa = mock(DFA.class);
        bitSet = mock(BitSet.class);
        configs = mock(ATNConfigSet.class);
    }

    @Test
    public void testCreate() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullListener() {

        new CommentIgnoringErrorListener(null, COMMENT_TYPES);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullCommentTypes() {

        new CommentIgnoringErrorListener(mockListener, null);
    }

    @Test
    public void testSyntaxError() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);

        verify(mockListener, times(1)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test
    public void testSyntaxErrorWithCommentType() {

        when(token.getType()).thenReturn(COMMENT_TYPE_THREE);

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);

        verify(mockListener, times(0)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test
    public void testSyntaxErrorWithNullRecognizer() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .syntaxError(null, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);

        verify(mockListener, times(1)).syntaxError(null, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test(expected = NullPointerException.class)
    public void testSyntaxErrorWithNullToken() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .syntaxError(recognizer, null, LINE, CHAR_POSITION_IN_LINE, MESSAGE, exception);
    }

    @Test
    public void testSyntaxErrorWithNullMessage() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, null, exception);

        verify(mockListener, times(1)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, null, exception);
    }

    @Test
    public void testSyntaxErrorWithNullException() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, null);

        verify(mockListener, times(1)).syntaxError(recognizer, token, LINE, CHAR_POSITION_IN_LINE, MESSAGE, null);
    }

    @Test
    public void testReportAmbiguity() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);
    }

    @Test
    public void testReportAmbiguityWithNullRecognizer() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAmbiguity(null, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);

        verify(mockListener, times(1)).reportAmbiguity(null, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);
    }

    @Test
    public void testReportAmbiguityWithNullDfa() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAmbiguity(recognizer, null, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, null, START_INDEX, STOP_INDEX, EXACT, bitSet, configs);
    }

    @Test
    public void testReportAmbiguityWithNullBitSet() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, null, configs);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, null, configs);
    }

    @Test
    public void testReportAmbiguityWithNullConfigs() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, null);

        verify(mockListener, times(1)).reportAmbiguity(recognizer, dfa, START_INDEX, STOP_INDEX, EXACT, bitSet, null);
    }

    @Test
    public void testReportAttemptingFullContext() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullRecognizer() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAttemptingFullContext(null, dfa, START_INDEX, STOP_INDEX, bitSet, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(null, dfa, START_INDEX, STOP_INDEX, bitSet, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullDfa() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAttemptingFullContext(recognizer, null, START_INDEX, STOP_INDEX, bitSet, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, null, START_INDEX, STOP_INDEX, bitSet, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullBitSet() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, null, configs);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, null, configs);
    }

    @Test
    public void testReportAttemptingFullContextWithNullConfigs() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, null);

        verify(mockListener, times(1))
                .reportAttemptingFullContext(recognizer, dfa, START_INDEX, STOP_INDEX, bitSet, null);
    }

    @Test
    public void testReportContextSensitivity() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);

        verify(mockListener, times(1))
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);
    }

    @Test
    public void testReportContextSensitivityWithNullRecognizer() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportContextSensitivity(null, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);

        verify(mockListener, times(1))
                .reportContextSensitivity(null, dfa, START_INDEX, STOP_INDEX, PREDICTION, configs);
    }

    @Test
    public void testReportContextSensitivityWithNullDfa() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportContextSensitivity(recognizer, null, START_INDEX, STOP_INDEX, PREDICTION, configs);

        verify(mockListener, times(1))
                .reportContextSensitivity(recognizer, null, START_INDEX, STOP_INDEX, PREDICTION, configs);
    }

    @Test
    public void testReportContextSensitivityWithNullConfigs() {

        new CommentIgnoringErrorListener(mockListener, COMMENT_TYPES)
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, null);

        verify(mockListener, times(1))
                .reportContextSensitivity(recognizer, dfa, START_INDEX, STOP_INDEX, PREDICTION, null);
    }
}
