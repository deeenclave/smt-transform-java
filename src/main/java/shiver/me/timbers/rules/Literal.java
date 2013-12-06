package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Literal extends CompositeTransformation {
    public static final String NAME = "literal";

    public Literal(Applyer applyer) {
        super(NAME, applyer);
    }
}
