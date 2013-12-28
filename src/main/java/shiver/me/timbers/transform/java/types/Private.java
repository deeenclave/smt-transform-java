package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Private extends CompositeTokenTransformation {
    public static final String NAME = "'private'";

    public Private(TokenApplier applier) {
        super(NAME, applier);
    }
}
