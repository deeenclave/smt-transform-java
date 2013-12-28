package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Default extends CompositeTokenTransformation {
    public static final String NAME = "'default'";

    public Default(TokenApplier applier) {
        super(NAME, applier);
    }
}
