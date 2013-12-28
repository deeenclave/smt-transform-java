package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class TypeArgument extends CompositeTokenTransformation {
    public static final String NAME = "typeArgument";

    public TypeArgument(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
