package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class FormalParameter extends CompositeTransformation {
    public static final String NAME = "formalParameter";

    public FormalParameter(Applyer applyer) {
        super(NAME, applyer);
    }
}
