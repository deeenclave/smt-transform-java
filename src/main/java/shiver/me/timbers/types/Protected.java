package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Protected extends CompositeTransformation {
    public static final String NAME = "'protected'";

    public Protected(Applyer applyer) {
        super(NAME, applyer);
    }
}
