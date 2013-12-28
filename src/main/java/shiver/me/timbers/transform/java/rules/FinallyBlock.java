package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class FinallyBlock extends CompositeTokenTransformation {
    public static final String NAME = "finallyBlock";

    public FinallyBlock(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
