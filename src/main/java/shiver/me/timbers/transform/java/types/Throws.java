package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Throws extends CompositeTokenTransformation {
    public static final String NAME = "'throws'";

    public Throws(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
