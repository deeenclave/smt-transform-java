package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Expression extends CompositeTransformation {
    public static final String NAME = "expression";

    public Expression(Applyer applyer) {
        super(NAME, applyer);
    }
}
