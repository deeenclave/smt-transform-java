package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class InnerCreator extends CompositeTransformation {
    public static final String NAME = "innerCreator";

    public InnerCreator(Applyer applyer) {
        super(NAME, applyer);
    }
}
