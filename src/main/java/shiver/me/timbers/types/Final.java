package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Final extends CompositeTransformation {
    public static final String NAME = "'final'";

    public Final(Applyer applyer) {
        super(NAME, applyer);
    }
}
