package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassOrInterfaceModifier extends CompositeTransformation {
    public static final String NAME = "classOrInterfaceModifier";

    public ClassOrInterfaceModifier(Applyer applyer) {
        super(NAME, applyer);
    }
}
