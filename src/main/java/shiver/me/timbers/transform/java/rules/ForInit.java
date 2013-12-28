package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForInit extends CompositeTokenTransformation {
    public static final String NAME = "forInit";

    public ForInit(TokenApplier applier) {
        super(NAME, applier);
    }
}
