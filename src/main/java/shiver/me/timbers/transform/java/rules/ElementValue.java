package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ElementValue extends CompositeTokenTransformation {
    public static final String NAME = "elementValue";

    public ElementValue(TokenApplier applier) {
        super(NAME, applier);
    }
}
