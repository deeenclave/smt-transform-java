package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ResourceSpecification extends CompositeTransformation {
    public static final String NAME = "resourceSpecification";

    public ResourceSpecification(Applyer applyer) {
        super(NAME, applyer);
    }
}
