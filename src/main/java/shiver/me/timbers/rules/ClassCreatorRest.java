package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassCreatorRest extends CompositeTransformation {
    public static final String NAME = "classCreatorRest";

    public ClassCreatorRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
