package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeBound extends CompositeTransformation {
    public static final String NAME = "typeBound";

    public TypeBound(Applyer applyer) {
        super(NAME, applyer);
    }
}
