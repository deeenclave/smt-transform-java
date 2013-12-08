package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class InterfaceBodyDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceBodyDeclaration";

    public InterfaceBodyDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
