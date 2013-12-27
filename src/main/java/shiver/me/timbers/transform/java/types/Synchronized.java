package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Synchronized extends CompositeTransformation {
    public static final String NAME = "'synchronized'";

    public Synchronized(Applyer applyer) {
        super(NAME, applyer);
    }
}
