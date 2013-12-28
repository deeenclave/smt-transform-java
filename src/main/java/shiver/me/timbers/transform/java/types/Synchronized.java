package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Synchronized extends CompositeTokenTransformation {
    public static final String NAME = "'synchronized'";

    public Synchronized(TokenApplier applier) {
        super(NAME, applier);
    }
}
