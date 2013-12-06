package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Assert extends CompositeTransformation {
    public static final String NAME = "'assert'";

    public Assert(Applyer applyer) {
        super(NAME, applyer);
    }
}
