package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AnnotationTypeElementRest extends CompositeTokenTransformation {
    public static final String NAME = "annotationTypeElementRest";

    public AnnotationTypeElementRest(TokenApplier applier) {
        super(NAME, applier);
    }
}
