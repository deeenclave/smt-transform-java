package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class InterfaceMemberDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceMemberDeclaration";

    public InterfaceMemberDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
