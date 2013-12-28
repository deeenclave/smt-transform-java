package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Continue extends CompositeTokenTransformation {
    public static final String NAME = "'continue'";

    public Continue(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
