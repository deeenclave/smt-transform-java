package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Public extends CompositeTransformation {
    public static final String NAME = "'public'";

    public Public(Applyer applyer) {
        super(NAME, applyer);
    }
}
