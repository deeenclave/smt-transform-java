package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Long extends CompositeTransformation {
    public static final String NAME = "'long'";

    public Long(Applyer applyer) {
        super(NAME, applyer);
    }
}
