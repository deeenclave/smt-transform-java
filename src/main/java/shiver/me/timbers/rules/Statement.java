package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Statement extends CompositeTransformation {
    public static final String NAME = "statement";

    public Statement(Applyer applyer) {
        super(NAME, applyer);
    }
}
