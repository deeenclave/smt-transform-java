package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Static extends CompositeTokenTransformation {
    public static final String NAME = "'static'";

    public Static(TokenApplier applier) {
        super(NAME, applier);
    }
}
