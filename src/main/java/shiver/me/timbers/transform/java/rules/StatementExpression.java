package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class StatementExpression extends CompositeTransformation {
    public static final String NAME = "statementExpression";

    public StatementExpression(Applyer applyer) {
        super(NAME, applyer);
    }
}
