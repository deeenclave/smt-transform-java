package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Boolean extends CompositeTokenTransformation {
    public static final String NAME = "'boolean'";

    public Boolean(TokenApplier applier) {
        super(NAME, applier);
    }
}
