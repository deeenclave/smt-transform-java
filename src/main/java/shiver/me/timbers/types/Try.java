package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Try extends CompositeTransformation {
    public static final String NAME = "'try'";

    public Try(Applyer applyer) {
        super(NAME, applyer);
    }
}
