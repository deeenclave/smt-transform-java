package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Else extends CompositeTransformation {
    public static final String NAME = "'else'";

    public Else(Applyer applyer) {
        super(NAME, applyer);
    }
}
