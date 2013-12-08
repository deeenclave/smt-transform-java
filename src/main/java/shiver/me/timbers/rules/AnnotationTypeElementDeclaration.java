package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class AnnotationTypeElementDeclaration extends CompositeTransformation {
    public static final String NAME = "annotationTypeElementDeclaration";

    public AnnotationTypeElementDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
