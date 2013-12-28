package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class BooleanLiteral extends CompositeTokenTransformation {
    public static final String NAME = "BooleanLiteral";

    public BooleanLiteral(TokenApplier applier) {
        super(NAME, applier);
    }
}
