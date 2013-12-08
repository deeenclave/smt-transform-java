package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationTypeBody extends CompositeTransformation {
    public static final String NAME = "annotationTypeBody";

    public AnnotationTypeBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
