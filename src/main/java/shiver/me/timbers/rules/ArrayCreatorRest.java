package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ArrayCreatorRest extends CompositeTransformation {
    public static final String NAME = "arrayCreatorRest";

    public ArrayCreatorRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
