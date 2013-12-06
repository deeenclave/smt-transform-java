package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Short extends CompositeTransformation {
    public static final String NAME = "'short'";

    public Short(Applyer applyer) {
        super(NAME, applyer);
    }
}
