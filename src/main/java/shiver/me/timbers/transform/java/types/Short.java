package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Short extends CompositeTransformation {
    public static final String NAME = "'short'";

    public Short(Applyer applyer) {
        super(NAME, applyer);
    }
}
