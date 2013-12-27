package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Public extends CompositeTransformation {
    public static final String NAME = "'public'";

    public Public(Applyer applyer) {
        super(NAME, applyer);
    }
}
