package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class FieldDeclaration extends CompositeTransformation {
    public static final String NAME = "fieldDeclaration";

    public FieldDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
