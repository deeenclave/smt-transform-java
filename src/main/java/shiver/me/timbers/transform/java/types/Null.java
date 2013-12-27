package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Null extends CompositeTransformation {
    public static final String NAME = "'null'";

    public Null(Applyer applyer) {
        super(NAME, applyer);
    }
}
