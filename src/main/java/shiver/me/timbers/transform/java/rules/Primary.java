package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Primary extends CompositeTokenTransformation {
    public static final String NAME = "primary";

    public Primary(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
