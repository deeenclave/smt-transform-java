package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Throw extends CompositeTransformation {
    public static final String NAME = "'throw'";

    public Throw(Applyer applyer) {
        super(NAME, applyer);
    }
}
