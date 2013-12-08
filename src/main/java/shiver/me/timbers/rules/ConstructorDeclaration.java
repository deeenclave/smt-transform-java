package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ConstructorDeclaration extends CompositeTransformation {
    public static final String NAME = "constructorDeclaration";

    public ConstructorDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
