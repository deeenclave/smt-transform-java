package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ElementValueArrayInitializer extends CompositeTokenTransformation {
    public static final String NAME = "elementValueArrayInitializer";

    public ElementValueArrayInitializer(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
