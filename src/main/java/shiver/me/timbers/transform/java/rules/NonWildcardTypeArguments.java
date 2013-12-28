package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class NonWildcardTypeArguments extends CompositeTokenTransformation {
    public static final String NAME = "nonWildcardTypeArguments";

    public NonWildcardTypeArguments(TokenApplier applier) {
        super(NAME, applier);
    }
}
