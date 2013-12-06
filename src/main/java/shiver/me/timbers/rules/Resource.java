package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Resource extends CompositeTransformation {
    public static final String NAME = "resource";

    public Resource(Applyer applyer) {
        super(NAME, applyer);
    }
}
