package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Long extends CompositeTransformation {
    public static final String NAME = "'long'";

    public Long(Applyer applyer) {
        super(NAME, applyer);
    }
}
