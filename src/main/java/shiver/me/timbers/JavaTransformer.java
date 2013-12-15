package shiver.me.timbers;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import shiver.me.timbers.listeners.TransformationAwareErrorListener;
import shiver.me.timbers.listeners.TransformingParseTreeListener;
import shiver.me.timbers.transform.TransformableString;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.Transformer;

import java.io.IOException;
import java.io.InputStream;

import static shiver.me.timbers.Asserts.assertIsNotNull;

/**
 * A Transformation for Java source code, it will apply any Transformations that have names matching the different token names.
 * These names can be found in the {@link JavaParser#tokenNames} array.
 */
public class JavaTransformer implements Transformer {

    private final Transformations parentTransformations;
    private final Transformations errorTransformations;

    public JavaTransformer(Transformations parentTransformations, Transformations errorTransformations) {

        assertIsNotNull(Transformations.class.getSimpleName() + " parentTransformations argument cannot be null.",
                parentTransformations);
        assertIsNotNull(Transformations.class.getSimpleName() + " errorTransformations argument cannot be null.",
                errorTransformations);

        this.parentTransformations = parentTransformations;
        this.errorTransformations = errorTransformations;
    }

    @Override
    public String transform(InputStream stream, final Transformations transformations) {

        final String source = toString(stream);

        final JavaParser parser = buildParser(source, errorTransformations);

        final ParserRuleContext result = parser.compilationUnit();

        final ParseTreeListener listener = new TransformingParseTreeListener(parser, transformations,
                parentTransformations, errorTransformations, new TransformableString(source));

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, result);

        return listener.toString();
    }

    private static String toString(InputStream stream) {

        try {

            return IOUtils.toString(stream);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
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
