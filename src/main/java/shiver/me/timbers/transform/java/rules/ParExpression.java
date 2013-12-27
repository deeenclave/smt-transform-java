package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ParExpression extends CompositeTransformation {
    public static final String NAME = "parExpression";

    public ParExpression(Applyer applyer) {
        super(NAME, applyer);
    }
}
