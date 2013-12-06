package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class MethodBody extends CompositeTransformation {
    public static final String NAME = "methodBody";

    public MethodBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
