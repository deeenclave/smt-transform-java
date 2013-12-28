package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ConstructorDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "constructorDeclaration";

    public ConstructorDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
