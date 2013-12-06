package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Volatile extends CompositeTransformation {
    public static final String NAME = "'volatile'";

    public Volatile(Applyer applyer) {
        super(NAME, applyer);
    }
}
