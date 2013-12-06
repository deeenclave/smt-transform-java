package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Instanceof extends CompositeTransformation {
    public static final String NAME = "'instanceof'";

    public Instanceof(Applyer applyer) {
        super(NAME, applyer);
    }
}
