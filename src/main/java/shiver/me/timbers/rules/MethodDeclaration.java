package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class MethodDeclaration extends CompositeTransformation {
    public static final String NAME = "methodDeclaration";

    public MethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
