package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class If extends CompositeTransformation {
    public static final String NAME = "'if'";

    public If(Applyer applyer) {
        super(NAME, applyer);
    }
}
