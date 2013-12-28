package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ConstantExpression extends CompositeTokenTransformation {
    public static final String NAME = "constantExpression";

    public ConstantExpression(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
