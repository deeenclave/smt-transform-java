package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class VariableDeclarators extends CompositeTransformation {
    public static final String NAME = "variableDeclarators";

    public VariableDeclarators(Applyer applyer) {
        super(NAME, applyer);
    }
}
