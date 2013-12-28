package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableModifier extends CompositeTokenTransformation {
    public static final String NAME = "variableModifier";

    public VariableModifier(TokenApplier applier) {
        super(NAME, applier);
    }
}
