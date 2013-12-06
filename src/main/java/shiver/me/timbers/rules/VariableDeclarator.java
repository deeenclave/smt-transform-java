package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class VariableDeclarator extends CompositeTransformation {
    public static final String NAME = "variableDeclarator";

    public VariableDeclarator(Applyer applyer) {
        super(NAME, applyer);
    }
}
