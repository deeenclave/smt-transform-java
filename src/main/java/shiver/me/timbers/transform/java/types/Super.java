package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Super extends CompositeTransformation {
    public static final String NAME = "'super'";

    public Super(Applyer applyer) {
        super(NAME, applyer);
    }
}
