package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class EnumBodyDeclarations extends CompositeTransformation {
    public static final String NAME = "enumBodyDeclarations";

    public EnumBodyDeclarations(Applyer applyer) {
        super(NAME, applyer);
    }
}
