package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AnnotationTypeDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "annotationTypeDeclaration";

    public AnnotationTypeDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
