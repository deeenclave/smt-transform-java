package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class TypeBound extends CompositeTokenTransformation {
    public static final String NAME = "typeBound";

    public TypeBound(TokenApplier applier) {
        super(NAME, applier);
    }
}
