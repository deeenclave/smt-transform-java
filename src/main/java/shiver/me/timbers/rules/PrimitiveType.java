package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class PrimitiveType extends CompositeTransformation {
    public static final String NAME = "primitiveType";

    public PrimitiveType(Applyer applyer) {
        super(NAME, applyer);
    }
}
