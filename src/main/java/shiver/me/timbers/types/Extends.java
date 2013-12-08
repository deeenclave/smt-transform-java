package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Extends extends CompositeTransformation {
    public static final String NAME = "'extends'";

    public Extends(Applyer applyer) {
        super(NAME, applyer);
    }
}
