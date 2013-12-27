package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class VariableDeclarators extends CompositeTransformation {
    public static final String NAME = "variableDeclarators";

    public VariableDeclarators(Applyer applyer) {
        super(NAME, applyer);
    }
}
