package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Class extends CompositeTokenTransformation {
    public static final String NAME = "'class'";

    public Class(TokenApplier applier) {
        super(NAME, applier);
    }
}
