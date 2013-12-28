package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ElementValuePair extends CompositeTokenTransformation {
    public static final String NAME = "elementValuePair";

    public ElementValuePair(TokenApplier applier) {
        super(NAME, applier);
    }
}
