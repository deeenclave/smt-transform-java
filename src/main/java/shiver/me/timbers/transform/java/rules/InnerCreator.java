package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class InnerCreator extends CompositeTokenTransformation {
    public static final String NAME = "innerCreator";

    public InnerCreator(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
