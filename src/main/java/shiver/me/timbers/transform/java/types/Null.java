package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Null extends CompositeTokenTransformation {
    public static final String NAME = "'null'";

    public Null(TokenApplier applier) {
        super(NAME, applier);
    }
}
