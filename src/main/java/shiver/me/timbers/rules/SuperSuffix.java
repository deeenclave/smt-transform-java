package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class SuperSuffix extends CompositeTransformation {
    public static final String NAME = "superSuffix";

    public SuperSuffix(Applyer applyer) {
        super(NAME, applyer);
    }
}
