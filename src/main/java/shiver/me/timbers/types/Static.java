package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Static extends CompositeTransformation {
    public static final String NAME = "'static'";

    public Static(Applyer applyer) {
        super(NAME, applyer);
    }
}
