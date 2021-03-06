package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class InterfaceBodyDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "interfaceBodyDeclaration";

    public InterfaceBodyDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
