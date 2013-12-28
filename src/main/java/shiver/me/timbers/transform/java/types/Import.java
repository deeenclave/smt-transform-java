package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Import extends CompositeTokenTransformation {
    public static final String NAME = "'import'";

    public Import(TokenApplier applier) {
        super(NAME, applier);
    }
}
