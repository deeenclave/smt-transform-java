package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SuperSuffix extends CompositeTokenTransformation {
    public static final String NAME = "superSuffix";

    public SuperSuffix(TokenApplier applier) {
        super(NAME, applier);
    }
}
