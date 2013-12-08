package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationMethodOrConstantRest extends CompositeTransformation {
    public static final String NAME = "annotationMethodOrConstantRest";

    public AnnotationMethodOrConstantRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
