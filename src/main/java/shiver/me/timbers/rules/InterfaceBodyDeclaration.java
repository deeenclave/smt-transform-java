package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class InterfaceBodyDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceBodyDeclaration";

    public InterfaceBodyDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
