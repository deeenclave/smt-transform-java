package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class FormalParameter extends CompositeTransformation {
    public static final String NAME = "formalParameter";

    public FormalParameter(Applyer applyer) {
        super(NAME, applyer);
    }
}
