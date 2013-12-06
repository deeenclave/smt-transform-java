package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeArgument extends CompositeTransformation {
    public static final String NAME = "typeArgument";

    public TypeArgument(Applyer applyer) {
        super(NAME, applyer);
    }
}
