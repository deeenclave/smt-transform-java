package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Void extends CompositeTransformation {
    public static final String NAME = "'void'";

    public Void(Applyer applyer) {
        super(NAME, applyer);
    }
}
