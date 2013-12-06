package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class FinallyBlock extends CompositeTransformation {
    public static final String NAME = "finallyBlock";

    public FinallyBlock(Applyer applyer) {
        super(NAME, applyer);
    }
}
