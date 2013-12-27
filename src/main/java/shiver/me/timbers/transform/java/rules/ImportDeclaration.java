package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ImportDeclaration extends CompositeTransformation {
    public static final String NAME = "importDeclaration";

    public ImportDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
