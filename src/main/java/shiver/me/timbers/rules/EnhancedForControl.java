package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class EnhancedForControl extends CompositeTransformation {
    public static final String NAME = "enhancedForControl";

    public EnhancedForControl(Applyer applyer) {
        super(NAME, applyer);
    }
}
