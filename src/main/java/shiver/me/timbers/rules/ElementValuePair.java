package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ElementValuePair extends CompositeTransformation {
    public static final String NAME = "elementValuePair";

    public ElementValuePair(Applyer applyer) {
        super(NAME, applyer);
    }
}
