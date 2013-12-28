package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class EnumDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "enumDeclaration";

    public EnumDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
