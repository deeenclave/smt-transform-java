package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class WhiteSpace extends CompositeTransformation {
    public static final String NAME = "WS";

    public WhiteSpace(Applyer applyer) {
        super(NAME, applyer);
    }
}
