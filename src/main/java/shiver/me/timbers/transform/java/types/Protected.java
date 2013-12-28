package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Protected extends CompositeTokenTransformation {
    public static final String NAME = "'protected'";

    public Protected(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
