package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Super extends CompositeTransformation {
    public static final String NAME = "'super'";

    public Super(Applyer applyer) {
        super(NAME, applyer);
    }
}
