package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class For extends CompositeTransformation {
    public static final String NAME = "'for'";

    public For(Applyer applyer) {
        super(NAME, applyer);
    }
}
