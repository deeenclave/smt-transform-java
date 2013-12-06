package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationTypeBody extends CompositeTransformation {
    public static final String NAME = "annotationTypeBody";

    public AnnotationTypeBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
