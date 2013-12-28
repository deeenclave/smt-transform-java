package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class StatementExpression extends CompositeTokenTransformation {
    public static final String NAME = "statementExpression";

    public StatementExpression(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
