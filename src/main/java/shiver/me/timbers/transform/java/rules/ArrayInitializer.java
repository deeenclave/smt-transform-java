package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ArrayInitializer extends CompositeTokenTransformation {
    public static final String NAME = "arrayInitializer";

    public ArrayInitializer(TokenApplier applier) {
        super(NAME, applier);
    }
}
