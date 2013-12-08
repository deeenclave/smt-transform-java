package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class EnumConstant extends CompositeTransformation {
    public static final String NAME = "enumConstant";

    public EnumConstant(Applyer applyer) {
        super(NAME, applyer);
    }
}
