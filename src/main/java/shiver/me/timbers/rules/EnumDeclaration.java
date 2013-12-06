package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class EnumDeclaration extends CompositeTransformation {
    public static final String NAME = "enumDeclaration";

    public EnumDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
