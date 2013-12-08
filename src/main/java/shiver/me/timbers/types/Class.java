package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Class extends CompositeTransformation {
    public static final String NAME = "'class'";

    public Class(Applyer applyer) {
        super(NAME, applyer);
    }
}
