package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class IntegerLiteral extends CompositeTokenTransformation {
    public static final String NAME = "IntegerLiteral";

    public IntegerLiteral(TokenApplier applier) {
        super(NAME, applier);
    }
}
