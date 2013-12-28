package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class AnnotationMethodRest extends CompositeTokenTransformation {
    public static final String NAME = "annotationMethodRest";

    public AnnotationMethodRest(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
