package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class InterfaceMethodDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "interfaceMethodDeclaration";

    public InterfaceMethodDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
