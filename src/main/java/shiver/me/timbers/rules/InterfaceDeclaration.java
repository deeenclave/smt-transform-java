package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class InterfaceDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceDeclaration";

    public InterfaceDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
