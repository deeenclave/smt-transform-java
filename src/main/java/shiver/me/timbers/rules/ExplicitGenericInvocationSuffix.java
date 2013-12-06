package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ExplicitGenericInvocationSuffix extends CompositeTransformation {
    public static final String NAME = "explicitGenericInvocationSuffix";

    public ExplicitGenericInvocationSuffix(Applyer applyer) {
        super(NAME, applyer);
    }
}
