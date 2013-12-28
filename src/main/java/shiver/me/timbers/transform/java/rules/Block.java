package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Block extends CompositeTokenTransformation {
    public static final String NAME = "block";

    public Block(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
