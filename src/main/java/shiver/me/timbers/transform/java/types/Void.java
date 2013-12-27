package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Void extends CompositeTransformation {
    public static final String NAME = "'void'";

    public Void(Applyer applyer) {
        super(NAME, applyer);
    }
}
