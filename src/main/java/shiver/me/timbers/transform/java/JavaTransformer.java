package shiver.me.timbers.transform.java;

import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.antlr4.Antlr4StringTransformer;

import javax.activation.MimeType;

/**
 * A StreamTransformer for Java source code, it will apply any Transformations that have names matching the different token
 * and rule names. These names can be found in the {@link JavaParser#tokenNames} and {@link JavaParser#ruleNames}
 * arrays.
 */
public class JavaTransformer extends Antlr4StringTransformer<JavaParser> {

    public static final MimeType TEXT_X_JAVA_SOURCE = quietMimeType("text", "x-java-source");

    public JavaTransformer() {
        super(TEXT_X_JAVA_SOURCE, new JavaParserBuilder());
    }
}
