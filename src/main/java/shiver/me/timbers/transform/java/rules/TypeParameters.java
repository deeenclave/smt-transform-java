package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeParameters extends CompositeTransformation {
    public static final String NAME = "typeParameters";

    public TypeParameters(Applyer applyer) {
        super(NAME, applyer);
    }
}
