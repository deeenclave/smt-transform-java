package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class MethodDeclaration extends CompositeTransformation {
    public static final String NAME = "methodDeclaration";

    public MethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
