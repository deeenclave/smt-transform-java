package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassOrInterfaceType extends CompositeTransformation {
    public static final String NAME = "classOrInterfaceType";

    public ClassOrInterfaceType(Applyer applyer) {
        super(NAME, applyer);
    }
}
