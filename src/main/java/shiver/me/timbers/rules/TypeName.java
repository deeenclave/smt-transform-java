package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeName extends CompositeTransformation {
    public static final String NAME = "typeName";

    public TypeName(Applyer applyer) {
        super(NAME, applyer);
    }
}
