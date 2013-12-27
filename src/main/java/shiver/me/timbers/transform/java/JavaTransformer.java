package shiver.me.timbers.transform.java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shiver.me.timbers.antlr4.java.JavaLexer;
import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.TransformableString;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.Transformer;
import shiver.me.timbers.transform.antlr4.listeners.LoggingErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformationAwareErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformingParseTreeListener;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import static shiver.me.timbers.asserts.Asserts.argumentIsNullMessage;
import static shiver.me.timbers.asserts.Asserts.assertIsNotNull;

/**
 * A Transformer for Java source code, it will apply any Transformations that have names matching the different token
 * and rule names. These names can be found in the {@link JavaParser#tokenNames} and {@link JavaParser#ruleNames}
 * arrays.
 */
public class JavaTransformer implements Transformer {

    private static final int STREAM_COPY_BUFFER_SIZE = 1024 * 4; // This value was taken from commons-io.

    private final Logger log = LoggerFactory.getLogger(JavaTransformer.class);

    private final Transformations parentTransformations;

    public JavaTransformer() {

        this(new IndividualTransformations());
    }

    /**
     * The {@code parentRuleTransformations} should contain any transformations that should
     * be run for the parent rule of a terminal token.
     */
    public JavaTransformer(Transformations parentRuleTransformations) {

        assertIsNotNull(argumentIsNullMessage("parentRuleTransformations"), parentRuleTransformations);

        log.debug("{} created.", JavaTransformer.class.getSimpleName());

        this.parentTransformations = parentRuleTransformations;
    }

    @Override
    public String transform(InputStream stream, final Transformations transformations) {

        log.debug("Reading input stream into string.");
        final String source = toString(stream);

        log.debug("Building parser.");
        final JavaParser parser = buildParser(source, transformations);

        log.debug("Parsing.");
        final ParserRuleContext result = parser.compilationUnit();

        final ParseTreeListener listener = new TransformingParseTreeListener(parser, transformations,
                parentTransformations, new TransformableString(source));

        log.debug("Begin walking the parse tree.");
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, result);

        return listener.toString();
    }

    private static String toString(InputStream stream) {

        final Reader reader = new InputStreamReader(stream);

        final StringWriter writer = copyToStringWriter(reader);

        return writer.toString();
    }

    private static StringWriter copyToStringWriter(Reader reader) {

        final StringWriter writer = new StringWriter();

        final char[] buffer = new char[STREAM_COPY_BUFFER_SIZE];

        try {

            for (int charsRead = 0; charsRead != -1; charsRead = reader.read(buffer)) {

                writer.write(buffer, 0, charsRead);
            }
        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        return writer;
    }

    private static JavaParser buildParser(String source, Transformations errorTransformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final JavaLexer lexer = new JavaLexer(charStream);

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final JavaParser parser = new JavaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new LoggingErrorListener(), errorTransformations));

        return parser;
    }
}
