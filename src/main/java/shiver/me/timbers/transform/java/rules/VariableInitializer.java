package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableInitializer extends CompositeTokenTransformation {
    public static final String NAME = "variableInitializer";

    public VariableInitializer(TokenApplier applier) {
        super(NAME, applier);
    }
}
