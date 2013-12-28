package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ElementValuePairs extends CompositeTokenTransformation {
    public static final String NAME = "elementValuePairs";

    public ElementValuePairs(TokenApplier applier) {
        super(NAME, applier);
    }
}
