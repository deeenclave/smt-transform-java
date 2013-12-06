package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationName extends CompositeTransformation {
    public static final String NAME = "annotationName";

    public AnnotationName(Applyer applyer) {
        super(NAME, applyer);
    }
}
