package shiver.me.timbers;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import shiver.me.timbers.listeners.CommentIgnoringErrorListener;

import java.io.IOException;
import java.io.InputStream;

import static shiver.me.timbers.Comments.COMMENT_TYPES;

/**
 * A Transformation for Java source code, it will apply any Transformations that have names matching the different token names.
 * These names can be found in the {@link JavaParser#tokenNames} array.
 *
 * @author Karl Bennett
 */
public class JavaTransformer implements Transformer {

    @Override
    public String transform(InputStream stream, final Transformations transformations) {

        final String source = toString(stream);

        final StringBuilder transformedSource = new StringBuilder(source);

        final JavaParser parser = buildParser(source);

        final ParserRuleContext result = parser.compilationUnit();

        final ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new TransformingParseTreeListener(transformedSource, transformations, parser), result);

        return transformedSource.toString();
    }

    private static String toString(InputStream stream) {

        try {

            return IOUtils.toString(stream);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    private static JavaParser buildParser(String source) {

        final CharStream charStream = new ANTLRInputStream(source);

        final JavaLexer lexer = new JavaLexer(charStream);

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final JavaParser parser = new JavaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new CommentIgnoringErrorListener(new ConsoleErrorListener(), COMMENT_TYPES));

        return parser;
    }
}
