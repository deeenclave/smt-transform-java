package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ElementValue extends CompositeTransformation {
    public static final String NAME = "elementValue";

    public ElementValue(Applyer applyer) {
        super(NAME, applyer);
    }
}
