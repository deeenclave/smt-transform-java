package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ElementValuePairs extends CompositeTokenTransformation {
    public static final String NAME = "elementValuePairs";

    public ElementValuePairs(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
