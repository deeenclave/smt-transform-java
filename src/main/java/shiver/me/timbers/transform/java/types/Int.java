package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Int extends CompositeTokenTransformation {
    public static final String NAME = "'int'";

    public Int(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
