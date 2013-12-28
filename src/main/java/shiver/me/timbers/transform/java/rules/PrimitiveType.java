package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class PrimitiveType extends CompositeTokenTransformation {
    public static final String NAME = "primitiveType";

    public PrimitiveType(TokenApplier applier) {
        super(NAME, applier);
    }
}
