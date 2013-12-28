package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Public extends CompositeTokenTransformation {
    public static final String NAME = "'public'";

    public Public(TokenApplier applier) {
        super(NAME, applier);
    }
}
