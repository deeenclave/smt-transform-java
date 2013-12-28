package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AnnotationTypeElementDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "annotationTypeElementDeclaration";

    public AnnotationTypeElementDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
