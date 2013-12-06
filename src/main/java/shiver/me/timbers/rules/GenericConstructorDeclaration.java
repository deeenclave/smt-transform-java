package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class GenericConstructorDeclaration extends CompositeTransformation {
    public static final String NAME = "genericConstructorDeclaration";

    public GenericConstructorDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
