package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ParExpression extends CompositeTransformation {
    public static final String NAME = "parExpression";

    public ParExpression(Applyer applyer) {
        super(NAME, applyer);
    }
}
