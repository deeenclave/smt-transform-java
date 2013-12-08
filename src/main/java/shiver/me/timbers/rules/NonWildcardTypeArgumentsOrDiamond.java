package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class NonWildcardTypeArgumentsOrDiamond extends CompositeTransformation {
    public static final String NAME = "nonWildcardTypeArgumentsOrDiamond";

    public NonWildcardTypeArgumentsOrDiamond(Applyer applyer) {
        super(NAME, applyer);
    }
}
