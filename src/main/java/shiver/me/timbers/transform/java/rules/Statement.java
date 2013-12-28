package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Statement extends CompositeTokenTransformation {
    public static final String NAME = "statement";

    public Statement(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
