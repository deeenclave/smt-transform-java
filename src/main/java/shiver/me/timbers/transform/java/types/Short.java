package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Short extends CompositeTokenTransformation {
    public static final String NAME = "'short'";

    public Short(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
