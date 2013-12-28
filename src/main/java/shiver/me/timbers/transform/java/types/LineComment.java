package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class LineComment extends CompositeTokenTransformation {
    public static final String NAME = "LINE_COMMENT";

    public LineComment(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
