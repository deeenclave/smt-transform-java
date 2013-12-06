package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeDeclaration extends CompositeTransformation {
    public static final String NAME = "typeDeclaration";

    public TypeDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
