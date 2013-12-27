package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeArgument extends CompositeTransformation {
    public static final String NAME = "typeArgument";

    public TypeArgument(Applyer applyer) {
        super(NAME, applyer);
    }
}
