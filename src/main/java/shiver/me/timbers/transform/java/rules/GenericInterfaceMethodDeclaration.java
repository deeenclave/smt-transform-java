package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class GenericInterfaceMethodDeclaration extends CompositeTransformation {
    public static final String NAME = "genericInterfaceMethodDeclaration";

    public GenericInterfaceMethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
