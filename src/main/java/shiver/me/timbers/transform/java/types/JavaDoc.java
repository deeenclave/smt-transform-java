package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JavaDoc extends CompositeTokenTransformation {
    public static final String NAME = "JAVA_DOC";

    public JavaDoc(TokenApplier applier) {
        super(NAME, applier);
    }
}
