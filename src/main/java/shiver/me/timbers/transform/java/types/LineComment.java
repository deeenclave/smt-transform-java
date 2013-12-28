package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LineComment extends CompositeTokenTransformation {
    public static final String NAME = "LINE_COMMENT";

    public LineComment(TokenApplier applier) {
        super(NAME, applier);
    }
}
