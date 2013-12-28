package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Block extends CompositeTokenTransformation {
    public static final String NAME = "block";

    public Block(TokenApplier applier) {
        super(NAME, applier);
    }
}
