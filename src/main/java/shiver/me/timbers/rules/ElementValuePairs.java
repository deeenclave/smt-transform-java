package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ElementValuePairs extends CompositeTransformation {
    public static final String NAME = "elementValuePairs";

    public ElementValuePairs(Applyer applyer) {
        super(NAME, applyer);
    }
}
