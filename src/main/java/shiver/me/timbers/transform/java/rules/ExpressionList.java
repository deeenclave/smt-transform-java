package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ExpressionList extends CompositeTokenTransformation {
    public static final String NAME = "expressionList";

    public ExpressionList(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
