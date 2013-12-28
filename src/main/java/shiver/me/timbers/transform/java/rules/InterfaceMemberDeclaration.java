package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class InterfaceMemberDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "interfaceMemberDeclaration";

    public InterfaceMemberDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
