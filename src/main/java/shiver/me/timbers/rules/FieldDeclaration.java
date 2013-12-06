package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class FieldDeclaration extends CompositeTransformation {
    public static final String NAME = "fieldDeclaration";

    public FieldDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
