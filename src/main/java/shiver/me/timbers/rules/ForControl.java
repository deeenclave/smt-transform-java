package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ForControl extends CompositeTransformation {
    public static final String NAME = "forControl";

    public ForControl(Applyer applyer) {
        super(NAME, applyer);
    }
}
