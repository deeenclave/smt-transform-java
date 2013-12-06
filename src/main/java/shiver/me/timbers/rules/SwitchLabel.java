package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class SwitchLabel extends CompositeTransformation {
    public static final String NAME = "switchLabel";

    public SwitchLabel(Applyer applyer) {
        super(NAME, applyer);
    }
}
