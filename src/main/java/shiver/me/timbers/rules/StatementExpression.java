package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class StatementExpression extends CompositeTransformation {
    public static final String NAME = "statementExpression";

    public StatementExpression(Applyer applyer) {
        super(NAME, applyer);
    }
}
