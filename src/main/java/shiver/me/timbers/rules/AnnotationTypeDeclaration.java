package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class AnnotationTypeDeclaration extends CompositeTransformation {
    public static final String NAME = "annotationTypeDeclaration";

    public AnnotationTypeDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
