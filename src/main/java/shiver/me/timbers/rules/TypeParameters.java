package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeParameters extends CompositeTransformation {
    public static final String NAME = "typeParameters";

    public TypeParameters(Applyer applyer) {
        super(NAME, applyer);
    }
}
