package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Strictfp extends CompositeTransformation {
    public static final String NAME = "'strictfp'";

    public Strictfp(Applyer applyer) {
        super(NAME, applyer);
    }
}
