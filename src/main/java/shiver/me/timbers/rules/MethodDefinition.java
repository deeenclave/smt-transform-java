package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class MethodDefinition extends CompositeTransformation {

    public static final String NAME = "methodDefinition";

    public MethodDefinition(Applyer applyer) {
        super(NAME, applyer);
    }
}
