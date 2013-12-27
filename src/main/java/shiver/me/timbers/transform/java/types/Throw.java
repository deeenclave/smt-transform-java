package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Throw extends CompositeTransformation {
    public static final String NAME = "'throw'";

    public Throw(Applyer applyer) {
        super(NAME, applyer);
    }
}
