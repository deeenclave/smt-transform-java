package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SwitchBlockStatementGroup extends CompositeTokenTransformation {
    public static final String NAME = "switchBlockStatementGroup";

    public SwitchBlockStatementGroup(TokenApplier applier) {
        super(NAME, applier);
    }
}
