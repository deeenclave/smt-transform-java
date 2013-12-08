package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassBody extends CompositeTransformation {
    public static final String NAME = "classBody";

    public ClassBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
