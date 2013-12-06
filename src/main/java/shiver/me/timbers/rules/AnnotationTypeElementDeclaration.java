package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationTypeElementDeclaration extends CompositeTransformation {
    public static final String NAME = "annotationTypeElementDeclaration";

    public AnnotationTypeElementDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
