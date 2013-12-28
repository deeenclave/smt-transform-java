package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableDeclaratorId extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclaratorId";

    public VariableDeclaratorId(TokenApplier applier) {
        super(NAME, applier);
    }
}
