package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class InterfaceMethodDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "interfaceMethodDeclaration";

    public InterfaceMethodDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
