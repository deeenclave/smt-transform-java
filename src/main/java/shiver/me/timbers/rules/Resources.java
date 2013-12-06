package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Resources extends CompositeTransformation {
    public static final String NAME = "resources";

    public Resources(Applyer applyer) {
        super(NAME, applyer);
    }
}
