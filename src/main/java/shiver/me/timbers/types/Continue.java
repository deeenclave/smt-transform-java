package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Continue extends CompositeTransformation {
    public static final String NAME = "'continue'";

    public Continue(Applyer applyer) {
        super(NAME, applyer);
    }
}
