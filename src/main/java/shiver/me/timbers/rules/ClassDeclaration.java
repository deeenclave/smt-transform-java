package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassDeclaration extends CompositeTransformation {
    public static final String NAME = "classDeclaration";

    public ClassDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
