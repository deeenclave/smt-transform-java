package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ForControl extends CompositeTransformation {
    public static final String NAME = "forControl";

    public ForControl(Applyer applyer) {
        super(NAME, applyer);
    }
}
