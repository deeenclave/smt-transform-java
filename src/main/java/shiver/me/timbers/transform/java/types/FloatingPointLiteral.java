package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class FloatingPointLiteral extends CompositeTokenTransformation {
    public static final String NAME = "FloatingPointLiteral";

    public FloatingPointLiteral(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
