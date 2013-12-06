package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class InterfaceDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceDeclaration";

    public InterfaceDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
