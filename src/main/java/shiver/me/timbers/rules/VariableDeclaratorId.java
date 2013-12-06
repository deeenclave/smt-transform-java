package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class VariableDeclaratorId extends CompositeTransformation {
    public static final String NAME = "variableDeclaratorId";

    public VariableDeclaratorId(Applyer applyer) {
        super(NAME, applyer);
    }
}
