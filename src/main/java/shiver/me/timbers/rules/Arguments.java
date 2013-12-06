package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Arguments extends CompositeTransformation {
    public static final String NAME = "arguments";

    public Arguments(Applyer applyer) {
        super(NAME, applyer);
    }
}
