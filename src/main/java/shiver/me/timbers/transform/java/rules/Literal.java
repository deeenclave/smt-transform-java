package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Literal extends CompositeTokenTransformation {
    public static final String NAME = "literal";

    public Literal(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
