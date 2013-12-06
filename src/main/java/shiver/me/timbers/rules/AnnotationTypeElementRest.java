package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationTypeElementRest extends CompositeTransformation {
    public static final String NAME = "annotationTypeElementRest";

    public AnnotationTypeElementRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
