package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Literal extends CompositeTransformation {
    public static final String NAME = "literal";

    public Literal(Applyer applyer) {
        super(NAME, applyer);
    }
}
