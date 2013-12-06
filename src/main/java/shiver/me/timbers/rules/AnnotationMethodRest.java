package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationMethodRest extends CompositeTransformation {
    public static final String NAME = "annotationMethodRest";

    public AnnotationMethodRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
