package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeArgumentsOrDiamond extends CompositeTransformation {
    public static final String NAME = "typeArgumentsOrDiamond";

    public TypeArgumentsOrDiamond(Applyer applyer) {
        super(NAME, applyer);
    }
}
