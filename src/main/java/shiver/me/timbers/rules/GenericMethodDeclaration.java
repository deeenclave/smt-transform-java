package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class GenericMethodDeclaration extends CompositeTransformation {
    public static final String NAME = "genericMethodDeclaration";

    public GenericMethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
