package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AnnotationMethodOrConstantRest extends CompositeTokenTransformation {
    public static final String NAME = "annotationMethodOrConstantRest";

    public AnnotationMethodOrConstantRest(TokenApplier applier) {
        super(NAME, applier);
    }
}
