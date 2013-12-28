package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Implements extends CompositeTokenTransformation {
    public static final String NAME = "'implements'";

    public Implements(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
