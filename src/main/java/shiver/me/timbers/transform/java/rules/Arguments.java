package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Arguments extends CompositeTokenTransformation {
    public static final String NAME = "arguments";

    public Arguments(TokenApplier applier) {
        super(NAME, applier);
    }
}
