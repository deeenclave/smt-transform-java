package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationName extends CompositeTransformation {
    public static final String NAME = "annotationName";

    public AnnotationName(Applyer applyer) {
        super(NAME, applyer);
    }
}
