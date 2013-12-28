package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AnnotationName extends CompositeTokenTransformation {
    public static final String NAME = "annotationName";

    public AnnotationName(TokenApplier applier) {
        super(NAME, applier);
    }
}
