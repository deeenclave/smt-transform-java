package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class TypeArguments extends CompositeTokenTransformation {
    public static final String NAME = "typeArguments";

    public TypeArguments(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
