package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class FormalParameters extends CompositeTransformation {
    public static final String NAME = "formalParameters";

    public FormalParameters(Applyer applyer) {
        super(NAME, applyer);
    }
}
