package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassDefinition extends CompositeTransformation {

    public static final String NAME = "classDefinition";

    public ClassDefinition(Applyer applyer) {
        super(NAME, applyer);
    }
}
