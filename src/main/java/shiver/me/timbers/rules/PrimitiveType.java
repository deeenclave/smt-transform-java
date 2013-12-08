package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class PrimitiveType extends CompositeTransformation {
    public static final String NAME = "primitiveType";

    public PrimitiveType(Applyer applyer) {
        super(NAME, applyer);
    }
}
