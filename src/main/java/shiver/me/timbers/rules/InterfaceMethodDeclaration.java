package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class InterfaceMethodDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceMethodDeclaration";

    public InterfaceMethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
