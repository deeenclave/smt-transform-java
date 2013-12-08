package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeDeclaration extends CompositeTransformation {
    public static final String NAME = "typeDeclaration";

    public TypeDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
