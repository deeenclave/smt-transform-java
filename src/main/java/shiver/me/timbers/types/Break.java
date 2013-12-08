package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Break extends CompositeTransformation {
    public static final String NAME = "'break'";

    public Break(Applyer applyer) {
        super(NAME, applyer);
    }
}
