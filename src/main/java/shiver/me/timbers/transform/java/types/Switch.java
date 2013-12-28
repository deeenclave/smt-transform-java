package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Switch extends CompositeTokenTransformation {
    public static final String NAME = "'switch'";

    public Switch(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
