package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Statement extends CompositeTransformation {
    public static final String NAME = "statement";

    public Statement(Applyer applyer) {
        super(NAME, applyer);
    }
}
