package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ConstantExpression extends CompositeTransformation {
    public static final String NAME = "constantExpression";

    public ConstantExpression(Applyer applyer) {
        super(NAME, applyer);
    }
}
