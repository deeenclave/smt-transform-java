package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Else extends CompositeTransformation {
    public static final String NAME = "'else'";

    public Else(Applyer applyer) {
        super(NAME, applyer);
    }
}
