package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Implements extends CompositeTransformation {
    public static final String NAME = "'implements'";

    public Implements(Applyer applyer) {
        super(NAME, applyer);
    }
}
