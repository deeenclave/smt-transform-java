package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class GenericMethodDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "genericMethodDeclaration";

    public GenericMethodDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
