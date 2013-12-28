package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ConstantDeclarator extends CompositeTokenTransformation {
    public static final String NAME = "constantDeclarator";

    public ConstantDeclarator(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
