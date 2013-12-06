package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ForUpdate extends CompositeTransformation {
    public static final String NAME = "forUpdate";

    public ForUpdate(Applyer applyer) {
        super(NAME, applyer);
    }
}
