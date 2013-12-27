package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class SwitchBlockStatementGroup extends CompositeTransformation {
    public static final String NAME = "switchBlockStatementGroup";

    public SwitchBlockStatementGroup(Applyer applyer) {
        super(NAME, applyer);
    }
}
