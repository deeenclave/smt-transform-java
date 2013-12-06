package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ConstDeclaration extends CompositeTransformation {
    public static final String NAME = "constDeclaration";

    public ConstDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
