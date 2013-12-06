package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ArrayInitializer extends CompositeTransformation {
    public static final String NAME = "arrayInitializer";

    public ArrayInitializer(Applyer applyer) {
        super(NAME, applyer);
    }
}
