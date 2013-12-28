package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class TypeParameters extends CompositeTokenTransformation {
    public static final String NAME = "typeParameters";

    public TypeParameters(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
