package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ElementValueArrayInitializer extends CompositeTransformation {
    public static final String NAME = "elementValueArrayInitializer";

    public ElementValueArrayInitializer(Applyer applyer) {
        super(NAME, applyer);
    }
}
