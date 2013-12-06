package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class FormalParameters extends CompositeTransformation {
    public static final String NAME = "formalParameters";

    public FormalParameters(Applyer applyer) {
        super(NAME, applyer);
    }
}
