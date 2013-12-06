package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class EnumConstantName extends CompositeTransformation {
    public static final String NAME = "enumConstantName";

    public EnumConstantName(Applyer applyer) {
        super(NAME, applyer);
    }
}
