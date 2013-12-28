package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Import extends CompositeTokenTransformation {
    public static final String NAME = "'import'";

    public Import(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
