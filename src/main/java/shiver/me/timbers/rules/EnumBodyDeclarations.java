package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class EnumBodyDeclarations extends CompositeTransformation {
    public static final String NAME = "enumBodyDeclarations";

    public EnumBodyDeclarations(Applyer applyer) {
        super(NAME, applyer);
    }
}
