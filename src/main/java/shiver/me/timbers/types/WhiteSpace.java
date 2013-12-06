package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class WhiteSpace extends CompositeTransformation {
    public static final String NAME = "WS";

    public WhiteSpace(Applyer applyer) {
        super(NAME, applyer);
    }
}
