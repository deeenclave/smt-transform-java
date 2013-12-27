package shiver.me.timbers.listeners;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LoggingErrorListenerTest {

    private static final int START_INDEX = 1;
    private static final int STOP_INDEX = 2;

    private Logger log;

    @Before
    public void setUp() {

        log = mock(Logger.class);
    }

    @Test
    public void testSyntaxError() {

        final String TEST_MESSAGE = "test message";

        final int LINE = 1;
        final int CHAR_INDEX = 2;

        new LoggingErrorListener(log).syntaxError(null, null, LINE, CHAR_INDEX, TEST_MESSAGE, null);

        verify(log, times(1)).warn(anyString(), eq(LINE), eq(CHAR_INDEX), eq(TEST_MESSAGE));
    }

    @Test
    public void testReportAmbiguity() {

        new LoggingErrorListener(log).reportAmbiguity(null, null, START_INDEX, STOP_INDEX, false, null, null);

        verify(log, times(1)).warn(anyString(), eq(START_INDEX), eq(STOP_INDEX));
    }

    @Test
    public void testReportAttemptingFullContext() {

        new LoggingErrorListener(log).reportAttemptingFullContext(null, null, START_INDEX, STOP_INDEX, null, null);

        verify(log, times(1)).warn(anyString(), eq(START_INDEX), eq(STOP_INDEX));
    }

    @Test
    public void testReportContextSensitivity() {

        new LoggingErrorListener(log).reportContextSensitivity(null, null, START_INDEX, STOP_INDEX, 0, null);

        verify(log, times(1)).warn(anyString(), eq(START_INDEX), eq(STOP_INDEX));
    }
}
