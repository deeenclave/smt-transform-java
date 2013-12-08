package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeParameter extends CompositeTransformation {
    public static final String NAME = "typeParameter";

    public TypeParameter(Applyer applyer) {
        super(NAME, applyer);
    }
}
