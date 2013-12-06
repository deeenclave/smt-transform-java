package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class InterfaceMemberDeclaration extends CompositeTransformation {
    public static final String NAME = "interfaceMemberDeclaration";

    public InterfaceMemberDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
