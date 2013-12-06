package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class EnumConstant extends CompositeTransformation {
    public static final String NAME = "enumConstant";

    public EnumConstant(Applyer applyer) {
        super(NAME, applyer);
    }
}
