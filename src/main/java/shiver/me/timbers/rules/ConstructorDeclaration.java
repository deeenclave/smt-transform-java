package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ConstructorDeclaration extends CompositeTransformation {
    public static final String NAME = "constructorDeclaration";

    public ConstructorDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
