package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Resources extends CompositeTransformation {
    public static final String NAME = "resources";

    public Resources(Applyer applyer) {
        super(NAME, applyer);
    }
}
