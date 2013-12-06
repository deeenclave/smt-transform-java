package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Static extends CompositeTransformation {
    public static final String NAME = "'static'";

    public Static(Applyer applyer) {
        super(NAME, applyer);
    }
}
