package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class EnumBodyDeclarations extends CompositeTokenTransformation {
    public static final String NAME = "enumBodyDeclarations";

    public EnumBodyDeclarations(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
