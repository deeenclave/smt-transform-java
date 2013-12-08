package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Identifier extends CompositeTransformation {
    public static final String NAME = "Identifier";

    public Identifier(Applyer applyer) {
        super(NAME, applyer);
    }
}
