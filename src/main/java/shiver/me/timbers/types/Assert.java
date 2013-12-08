package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Assert extends CompositeTransformation {
    public static final String NAME = "'assert'";

    public Assert(Applyer applyer) {
        super(NAME, applyer);
    }
}
