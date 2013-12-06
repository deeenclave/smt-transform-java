package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Break extends CompositeTransformation {
    public static final String NAME = "'break'";

    public Break(Applyer applyer) {
        super(NAME, applyer);
    }
}
