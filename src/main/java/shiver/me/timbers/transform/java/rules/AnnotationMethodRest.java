package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationMethodRest extends CompositeTransformation {
    public static final String NAME = "annotationMethodRest";

    public AnnotationMethodRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
