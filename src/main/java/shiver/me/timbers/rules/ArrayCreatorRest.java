package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ArrayCreatorRest extends CompositeTransformation {
    public static final String NAME = "arrayCreatorRest";

    public ArrayCreatorRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
