package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ForInit extends CompositeTransformation {
    public static final String NAME = "forInit";

    public ForInit(Applyer applyer) {
        super(NAME, applyer);
    }
}
