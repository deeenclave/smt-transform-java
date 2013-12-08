package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class EnumConstants extends CompositeTransformation {
    public static final String NAME = "enumConstants";

    public EnumConstants(Applyer applyer) {
        super(NAME, applyer);
    }
}
