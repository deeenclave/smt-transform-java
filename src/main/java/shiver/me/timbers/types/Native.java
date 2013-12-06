package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Native extends CompositeTransformation {
    public static final String NAME = "'native'";

    public Native(Applyer applyer) {
        super(NAME, applyer);
    }
}
