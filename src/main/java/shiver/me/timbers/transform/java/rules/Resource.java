package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Resource extends CompositeTokenTransformation {
    public static final String NAME = "resource";

    public Resource(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
