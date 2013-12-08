package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ExplicitGenericInvocationSuffix extends CompositeTransformation {
    public static final String NAME = "explicitGenericInvocationSuffix";

    public ExplicitGenericInvocationSuffix(Applyer applyer) {
        super(NAME, applyer);
    }
}
