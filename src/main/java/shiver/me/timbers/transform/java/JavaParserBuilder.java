package shiver.me.timbers.transform.java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import shiver.me.timbers.antlr4.java.JavaLexer;
import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.ParserBuilder;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.antlr4.listeners.LoggingErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformationAwareErrorListener;

/**
 * A {@code ParserBuilder} for the ANTLR4 {@code JavaParser}.
 */
public class JavaParserBuilder implements ParserBuilder<JavaParser> {

    @Override
    public JavaParser buildParser(String source, Transformations<TokenTransformation> errorTransformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final JavaLexer lexer = new JavaLexer(charStream);

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final JavaParser parser = new JavaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new LoggingErrorListener(), errorTransformations));

        return parser;
    }

    @Override
    public ParseTree parse(JavaParser parser) {

        return parser.compilationUnit();
    }
}
