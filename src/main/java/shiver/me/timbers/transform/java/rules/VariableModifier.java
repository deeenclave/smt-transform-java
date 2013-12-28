package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class VariableModifier extends CompositeTokenTransformation {
    public static final String NAME = "variableModifier";

    public VariableModifier(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
