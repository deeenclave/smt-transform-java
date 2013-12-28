package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ConstructorBody extends CompositeTokenTransformation {
    public static final String NAME = "constructorBody";

    public ConstructorBody(TokenApplier applier) {
        super(NAME, applier);
    }
}
