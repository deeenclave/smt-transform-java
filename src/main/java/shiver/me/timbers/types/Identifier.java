package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Identifier extends CompositeTransformation {
    public static final String NAME = "Identifier";

    public Identifier(Applyer applyer) {
        super(NAME, applyer);
    }
}
