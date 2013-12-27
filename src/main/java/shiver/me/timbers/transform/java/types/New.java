package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class New extends CompositeTransformation {
    public static final String NAME = "'new'";

    public New(Applyer applyer) {
        super(NAME, applyer);
    }
}
