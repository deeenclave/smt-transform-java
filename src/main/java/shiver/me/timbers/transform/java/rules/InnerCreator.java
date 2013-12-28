package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class InnerCreator extends CompositeTokenTransformation {
    public static final String NAME = "innerCreator";

    public InnerCreator(TokenApplier applier) {
        super(NAME, applier);
    }
}
