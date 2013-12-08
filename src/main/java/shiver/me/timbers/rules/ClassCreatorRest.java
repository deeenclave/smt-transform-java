package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassCreatorRest extends CompositeTransformation {
    public static final String NAME = "classCreatorRest";

    public ClassCreatorRest(Applyer applyer) {
        super(NAME, applyer);
    }
}
