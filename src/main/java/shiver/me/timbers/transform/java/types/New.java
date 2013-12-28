package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class New extends CompositeTokenTransformation {
    public static final String NAME = "'new'";

    public New(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
