package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ExplicitGenericInvocation extends CompositeTokenTransformation {
    public static final String NAME = "explicitGenericInvocation";

    public ExplicitGenericInvocation(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
