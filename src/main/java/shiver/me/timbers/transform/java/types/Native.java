package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Native extends CompositeTransformation {
    public static final String NAME = "'native'";

    public Native(Applyer applyer) {
        super(NAME, applyer);
    }
}
