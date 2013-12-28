package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class AnnotationTypeBody extends CompositeTokenTransformation {
    public static final String NAME = "annotationTypeBody";

    public AnnotationTypeBody(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
