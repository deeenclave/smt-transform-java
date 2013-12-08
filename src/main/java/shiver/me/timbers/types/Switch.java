package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Switch extends CompositeTransformation {
    public static final String NAME = "'switch'";

    public Switch(Applyer applyer) {
        super(NAME, applyer);
    }
}
