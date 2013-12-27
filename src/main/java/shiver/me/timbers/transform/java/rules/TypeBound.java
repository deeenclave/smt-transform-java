package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeBound extends CompositeTransformation {
    public static final String NAME = "typeBound";

    public TypeBound(Applyer applyer) {
        super(NAME, applyer);
    }
}
