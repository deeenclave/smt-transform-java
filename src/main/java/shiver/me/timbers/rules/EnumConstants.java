package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class EnumConstants extends CompositeTransformation {
    public static final String NAME = "enumConstants";

    public EnumConstants(Applyer applyer) {
        super(NAME, applyer);
    }
}
