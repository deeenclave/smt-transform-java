package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ForInit extends CompositeTransformation {
    public static final String NAME = "forInit";

    public ForInit(Applyer applyer) {
        super(NAME, applyer);
    }
}
