package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ExplicitGenericInvocationSuffix extends CompositeTokenTransformation {
    public static final String NAME = "explicitGenericInvocationSuffix";

    public ExplicitGenericInvocationSuffix(TokenApplier applier) {
        super(NAME, applier);
    }
}
