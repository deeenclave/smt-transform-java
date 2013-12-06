package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class GenericInterfaceMethodDeclaration extends CompositeTransformation {
    public static final String NAME = "genericInterfaceMethodDeclaration";

    public GenericInterfaceMethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
