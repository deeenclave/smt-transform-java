package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Expression extends CompositeTokenTransformation {
    public static final String NAME = "expression";

    public Expression(TokenApplier applier) {
        super(NAME, applier);
    }
}
