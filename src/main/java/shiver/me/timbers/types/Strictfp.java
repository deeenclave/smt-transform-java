package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Strictfp extends CompositeTransformation {
    public static final String NAME = "'strictfp'";

    public Strictfp(Applyer applyer) {
        super(NAME, applyer);
    }
}
