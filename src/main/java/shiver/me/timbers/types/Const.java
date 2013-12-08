package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Const extends CompositeTransformation {
    public static final String NAME = "'const'";

    public Const(Applyer applyer) {
        super(NAME, applyer);
    }
}
