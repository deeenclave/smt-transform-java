package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class VariableInitializer extends CompositeTransformation {
    public static final String NAME = "variableInitializer";

    public VariableInitializer(Applyer applyer) {
        super(NAME, applyer);
    }
}
