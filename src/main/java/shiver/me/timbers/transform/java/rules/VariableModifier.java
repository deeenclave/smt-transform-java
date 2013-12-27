package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class VariableModifier extends CompositeTransformation {
    public static final String NAME = "variableModifier";

    public VariableModifier(Applyer applyer) {
        super(NAME, applyer);
    }
}