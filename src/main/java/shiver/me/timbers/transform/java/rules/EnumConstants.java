package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class EnumConstants extends CompositeTokenTransformation {
    public static final String NAME = "enumConstants";

    public EnumConstants(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
