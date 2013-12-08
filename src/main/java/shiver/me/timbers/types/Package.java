package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Package extends CompositeTransformation {
    public static final String NAME = "'package'";

    public Package(Applyer applyer) {
        super(NAME, applyer);
    }
}
