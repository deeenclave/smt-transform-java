package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ConstantExpression extends CompositeTransformation {
    public static final String NAME = "constantExpression";

    public ConstantExpression(Applyer applyer) {
        super(NAME, applyer);
    }
}
