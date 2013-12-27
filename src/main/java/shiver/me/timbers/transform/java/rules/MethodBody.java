package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class MethodBody extends CompositeTransformation {
    public static final String NAME = "methodBody";

    public MethodBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
