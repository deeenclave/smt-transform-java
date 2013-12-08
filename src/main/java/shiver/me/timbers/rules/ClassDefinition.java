package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassDefinition extends CompositeTransformation {

    public static final String NAME = "classDefinition";

    public ClassDefinition(Applyer applyer) {
        super(NAME, applyer);
    }
}
