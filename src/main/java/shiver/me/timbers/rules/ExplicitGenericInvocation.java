package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ExplicitGenericInvocation extends CompositeTransformation {
    public static final String NAME = "explicitGenericInvocation";

    public ExplicitGenericInvocation(Applyer applyer) {
        super(NAME, applyer);
    }
}
