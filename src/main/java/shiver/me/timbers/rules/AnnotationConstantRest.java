package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationConstantRest extends CompositeTransformation {
    public static final String NAME = "annotationConstantRest";

    public AnnotationConstantRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
