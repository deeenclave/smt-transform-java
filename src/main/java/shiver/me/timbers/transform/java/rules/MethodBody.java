package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class MethodBody extends CompositeTokenTransformation {
    public static final String NAME = "methodBody";

    public MethodBody(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
