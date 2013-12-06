package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class New extends CompositeTransformation {
    public static final String NAME = "'new'";

    public New(Applyer applyer) {
        super(NAME, applyer);
    }
}
