package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Abstract extends CompositeTransformation {
    public static final String NAME = "'abstract'";

    public Abstract(Applyer applyer) {
        super(NAME, applyer);
    }
}
