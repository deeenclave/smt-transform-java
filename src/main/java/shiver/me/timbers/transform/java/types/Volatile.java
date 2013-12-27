package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Volatile extends CompositeTransformation {
    public static final String NAME = "'volatile'";

    public Volatile(Applyer applyer) {
        super(NAME, applyer);
    }
}
