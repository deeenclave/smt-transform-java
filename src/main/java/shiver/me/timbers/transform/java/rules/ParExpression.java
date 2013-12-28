package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ParExpression extends CompositeTokenTransformation {
    public static final String NAME = "parExpression";

    public ParExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
