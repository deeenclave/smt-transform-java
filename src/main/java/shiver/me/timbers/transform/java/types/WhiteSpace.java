package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class WhiteSpace extends CompositeTokenTransformation {
    public static final String NAME = "WS";

    public WhiteSpace(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
