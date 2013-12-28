package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForUpdate extends CompositeTokenTransformation {
    public static final String NAME = "forUpdate";

    public ForUpdate(TokenApplier applier) {
        super(NAME, applier);
    }
}
