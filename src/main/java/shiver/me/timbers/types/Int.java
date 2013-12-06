package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Int extends CompositeTransformation {
    public static final String NAME = "'int'";

    public Int(Applyer applyer) {
        super(NAME, applyer);
    }
}
