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
import shiver.me.timbers.rules.ClassDefinition;
import shiver.me.timbers.rules.MethodDefinition;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.Transformer;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import static shiver.me.timbers.JavaParser.*;

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

        final JavaParser parser = buildParser(source, transformations);

        final ParserRuleContext result = parser.compilationUnit();

        final ParseTreeListener listener = new TransformingParseTreeListener(parser, transformations,
                new HashMap<Integer, String>() {{
                   put(RULE_classDeclaration, ClassDefinition.NAME);
                   put(RULE_methodDeclaration, MethodDefinition.NAME);
                }},
                source);

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

    private static JavaParser buildParser(String source, Transformations transformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final JavaLexer lexer = new JavaLexer(charStream);

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final JavaParser parser = new JavaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new ConsoleErrorListener(), transformations));

        return parser;
    }
}
