package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Boolean extends CompositeTokenTransformation {
    public static final String NAME = "'boolean'";

    public Boolean(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
