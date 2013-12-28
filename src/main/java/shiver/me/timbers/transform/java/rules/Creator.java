package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Creator extends CompositeTokenTransformation {
    public static final String NAME = "creator";

    public Creator(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
