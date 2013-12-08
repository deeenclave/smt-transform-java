package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeArguments extends CompositeTransformation {
    public static final String NAME = "typeArguments";

    public TypeArguments(Applyer applyer) {
        super(NAME, applyer);
    }
}
