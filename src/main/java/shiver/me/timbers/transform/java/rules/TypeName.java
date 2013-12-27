package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeName extends CompositeTransformation {
    public static final String NAME = "typeName";

    public TypeName(Applyer applyer) {
        super(NAME, applyer);
    }
}
