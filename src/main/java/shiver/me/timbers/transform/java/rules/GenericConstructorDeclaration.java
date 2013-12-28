package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class GenericConstructorDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "genericConstructorDeclaration";

    public GenericConstructorDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
