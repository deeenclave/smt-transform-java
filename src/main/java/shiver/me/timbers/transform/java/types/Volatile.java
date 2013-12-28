package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Volatile extends CompositeTokenTransformation {
    public static final String NAME = "'volatile'";

    public Volatile(TokenApplier applier) {
        super(NAME, applier);
    }
}
