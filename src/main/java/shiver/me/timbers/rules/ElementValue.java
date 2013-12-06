package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ElementValue extends CompositeTransformation {
    public static final String NAME = "elementValue";

    public ElementValue(Applyer applyer) {
        super(NAME, applyer);
    }
}
