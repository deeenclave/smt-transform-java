package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Synchronized extends CompositeTransformation {
    public static final String NAME = "'synchronized'";

    public Synchronized(Applyer applyer) {
        super(NAME, applyer);
    }
}
