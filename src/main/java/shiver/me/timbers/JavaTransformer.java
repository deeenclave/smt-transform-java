package shiver.me.timbers;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import shiver.me.timbers.listeners.TransformationAwareErrorListener;
import shiver.me.timbers.listeners.TransformingParseTreeListener;
import shiver.me.timbers.transform.TransformableString;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.Transformer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import static shiver.me.timbers.Asserts.assertIsNotNull;

/**
 * A Transformation for Java source code, it will apply any Transformations that have names matching the different token
 * names. These names can be found in the {@link JavaParser#tokenNames} array.
 */
public class JavaTransformer implements Transformer {

    private static final int STREAM_COPY_BUFFER_SIZE = 1024 * 4; // This value was taken from commons-io.

    private final Transformations parentTransformations;

    public JavaTransformer(Transformations parentTransformations) {

        assertIsNotNull(Transformations.class.getSimpleName() + " parentTransformations argument cannot be null.",
                parentTransformations);

        this.parentTransformations = parentTransformations;
    }

    @Override
    public String transform(InputStream stream, final Transformations transformations) {

        final String source = toString(stream);

        final JavaParser parser = buildParser(source, transformations);

        final ParserRuleContext result = parser.compilationUnit();

        final ParseTreeListener listener = new TransformingParseTreeListener(parser, transformations,
                parentTransformations, new TransformableString(source));

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
        parser.addErrorListener(new TransformationAwareErrorListener(new ConsoleErrorListener(), errorTransformations));

        return parser;
    }
}
