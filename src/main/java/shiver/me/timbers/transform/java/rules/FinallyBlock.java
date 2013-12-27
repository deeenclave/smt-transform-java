package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class FinallyBlock extends CompositeTransformation {
    public static final String NAME = "finallyBlock";

    public FinallyBlock(Applyer applyer) {
        super(NAME, applyer);
    }
}
