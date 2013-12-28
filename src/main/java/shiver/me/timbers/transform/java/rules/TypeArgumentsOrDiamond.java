package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class TypeArgumentsOrDiamond extends CompositeTokenTransformation {
    public static final String NAME = "typeArgumentsOrDiamond";

    public TypeArgumentsOrDiamond(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
