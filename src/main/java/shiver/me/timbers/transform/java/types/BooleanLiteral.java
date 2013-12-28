package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class BooleanLiteral extends CompositeTokenTransformation {
    public static final String NAME = "BooleanLiteral";

    public BooleanLiteral(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
