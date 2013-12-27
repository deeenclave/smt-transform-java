package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ConstructorBody extends CompositeTransformation {
    public static final String NAME = "constructorBody";

    public ConstructorBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
