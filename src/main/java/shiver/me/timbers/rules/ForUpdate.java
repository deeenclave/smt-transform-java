package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ForUpdate extends CompositeTransformation {
    public static final String NAME = "forUpdate";

    public ForUpdate(Applyer applyer) {
        super(NAME, applyer);
    }
}
