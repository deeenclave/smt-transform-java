package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ElementValuePair extends CompositeTokenTransformation {
    public static final String NAME = "elementValuePair";

    public ElementValuePair(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
