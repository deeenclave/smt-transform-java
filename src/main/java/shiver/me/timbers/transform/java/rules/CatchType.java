package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class CatchType extends CompositeTransformation {
    public static final String NAME = "catchType";

    public CatchType(Applyer applyer) {
        super(NAME, applyer);
    }
}
