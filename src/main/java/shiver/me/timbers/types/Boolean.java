package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Boolean extends CompositeTransformation {
    public static final String NAME = "'boolean'";

    public Boolean(Applyer applyer) {
        super(NAME, applyer);
    }
}
