package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationTypeElementRest extends CompositeTransformation {
    public static final String NAME = "annotationTypeElementRest";

    public AnnotationTypeElementRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
