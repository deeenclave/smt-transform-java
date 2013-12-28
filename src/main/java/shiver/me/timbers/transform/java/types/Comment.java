package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Comment extends CompositeTokenTransformation {
    public static final String NAME = "COMMENT";

    public Comment(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
