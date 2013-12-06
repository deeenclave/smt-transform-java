package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class MethodDefinition extends CompositeTransformation {

    public static final String NAME = "methodDefinition";

    public MethodDefinition(Applyer applyer) {
        super(NAME, applyer);
    }
}
