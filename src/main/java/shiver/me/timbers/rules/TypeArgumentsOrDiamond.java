package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeArgumentsOrDiamond extends CompositeTransformation {
    public static final String NAME = "typeArgumentsOrDiamond";

    public TypeArgumentsOrDiamond(Applyer applyer) {
        super(NAME, applyer);
    }
}
