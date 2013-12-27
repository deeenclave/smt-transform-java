package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class GenericConstructorDeclaration extends CompositeTransformation {
    public static final String NAME = "genericConstructorDeclaration";

    public GenericConstructorDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
