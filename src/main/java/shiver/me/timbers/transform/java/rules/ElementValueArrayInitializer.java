package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ElementValueArrayInitializer extends CompositeTransformation {
    public static final String NAME = "elementValueArrayInitializer";

    public ElementValueArrayInitializer(Applyer applyer) {
        super(NAME, applyer);
    }
}
