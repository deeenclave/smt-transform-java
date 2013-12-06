package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Null extends CompositeTransformation {
    public static final String NAME = "'null'";

    public Null(Applyer applyer) {
        super(NAME, applyer);
    }
}
