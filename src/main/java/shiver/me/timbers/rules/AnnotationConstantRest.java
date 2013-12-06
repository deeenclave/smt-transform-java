package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationConstantRest extends CompositeTransformation {
    public static final String NAME = "annotationConstantRest";

    public AnnotationConstantRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
