package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class BlockStatement extends CompositeTransformation {
    public static final String NAME = "blockStatement";

    public BlockStatement(Applyer applyer) {
        super(NAME, applyer);
    }
}
