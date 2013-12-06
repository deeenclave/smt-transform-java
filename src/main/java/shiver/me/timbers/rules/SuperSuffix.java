package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class SuperSuffix extends CompositeTransformation {
    public static final String NAME = "superSuffix";

    public SuperSuffix(Applyer applyer) {
        super(NAME, applyer);
    }
}
