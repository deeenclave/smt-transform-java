package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class While extends CompositeTransformation {
    public static final String NAME = "'while'";

    public While(Applyer applyer) {
        super(NAME, applyer);
    }
}
