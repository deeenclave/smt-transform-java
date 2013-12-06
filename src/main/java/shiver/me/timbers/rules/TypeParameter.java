package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeParameter extends CompositeTransformation {
    public static final String NAME = "typeParameter";

    public TypeParameter(Applyer applyer) {
        super(NAME, applyer);
    }
}
