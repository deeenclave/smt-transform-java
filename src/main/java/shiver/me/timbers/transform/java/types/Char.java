package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Char extends CompositeTokenTransformation {
    public static final String NAME = "'char'";

    public Char(TokenApplier applier) {
        super(NAME, applier);
    }
}
