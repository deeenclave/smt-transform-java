package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class CatchType extends CompositeTransformation {
    public static final String NAME = "catchType";

    public CatchType(Applyer applyer) {
        super(NAME, applyer);
    }
}
