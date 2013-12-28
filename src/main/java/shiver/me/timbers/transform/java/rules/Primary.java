package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Primary extends CompositeTokenTransformation {
    public static final String NAME = "primary";

    public Primary(TokenApplier applier) {
        super(NAME, applier);
    }
}
