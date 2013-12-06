package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationMethodOrConstantRest extends CompositeTransformation {
    public static final String NAME = "annotationMethodOrConstantRest";

    public AnnotationMethodOrConstantRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
