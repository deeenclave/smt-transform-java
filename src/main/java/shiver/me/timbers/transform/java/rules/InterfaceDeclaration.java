package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class InterfaceDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "interfaceDeclaration";

    public InterfaceDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
