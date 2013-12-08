package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class EnhancedForControl extends CompositeTransformation {
    public static final String NAME = "enhancedForControl";

    public EnhancedForControl(Applyer applyer) {
        super(NAME, applyer);
    }
}
