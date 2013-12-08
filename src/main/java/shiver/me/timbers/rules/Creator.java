package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Creator extends CompositeTransformation {
    public static final String NAME = "creator";

    public Creator(Applyer applyer) {
        super(NAME, applyer);
    }
}
