package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class VariableDeclarator extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclarator";

    public VariableDeclarator(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
