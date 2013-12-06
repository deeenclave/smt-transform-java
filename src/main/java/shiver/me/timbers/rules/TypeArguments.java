package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeArguments extends CompositeTransformation {
    public static final String NAME = "typeArguments";

    public TypeArguments(Applyer applyer) {
        super(NAME, applyer);
    }
}
