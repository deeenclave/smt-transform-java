package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class VariableDeclarators extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclarators";

    public VariableDeclarators(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
