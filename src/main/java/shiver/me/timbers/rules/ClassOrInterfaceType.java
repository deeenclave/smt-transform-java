package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassOrInterfaceType extends CompositeTransformation {
    public static final String NAME = "classOrInterfaceType";

    public ClassOrInterfaceType(Applyer applyer) {
        super(NAME, applyer);
    }
}
