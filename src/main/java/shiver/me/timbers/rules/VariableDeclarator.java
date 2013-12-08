package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class VariableDeclarator extends CompositeTransformation {
    public static final String NAME = "variableDeclarator";

    public VariableDeclarator(Applyer applyer) {
        super(NAME, applyer);
    }
}
