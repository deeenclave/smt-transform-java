package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ElementValuePair extends CompositeTransformation {
    public static final String NAME = "elementValuePair";

    public ElementValuePair(Applyer applyer) {
        super(NAME, applyer);
    }
}
