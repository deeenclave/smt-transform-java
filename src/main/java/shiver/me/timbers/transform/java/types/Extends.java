package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Extends extends CompositeTokenTransformation {
    public static final String NAME = "'extends'";

    public Extends(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
