package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ImportDeclaration extends CompositeTransformation {
    public static final String NAME = "importDeclaration";

    public ImportDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
