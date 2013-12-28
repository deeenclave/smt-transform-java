package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ArrayInitializer extends CompositeTokenTransformation {
    public static final String NAME = "arrayInitializer";

    public ArrayInitializer(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
