package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ConstructorBody extends CompositeTransformation {
    public static final String NAME = "constructorBody";

    public ConstructorBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
