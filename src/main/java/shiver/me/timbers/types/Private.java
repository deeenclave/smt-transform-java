package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Private extends CompositeTransformation {
    public static final String NAME = "'private'";

    public Private(Applyer applyer) {
        super(NAME, applyer);
    }
}
