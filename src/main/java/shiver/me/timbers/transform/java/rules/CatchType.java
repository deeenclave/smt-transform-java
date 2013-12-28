package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CatchType extends CompositeTokenTransformation {
    public static final String NAME = "catchType";

    public CatchType(TokenApplier applier) {
        super(NAME, applier);
    }
}
