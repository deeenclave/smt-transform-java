package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Import extends CompositeTransformation {
    public static final String NAME = "'import'";

    public Import(Applyer applyer) {
        super(NAME, applyer);
    }
}
