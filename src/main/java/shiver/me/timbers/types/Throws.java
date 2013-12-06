package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Throws extends CompositeTransformation {
    public static final String NAME = "'throws'";

    public Throws(Applyer applyer) {
        super(NAME, applyer);
    }
}
