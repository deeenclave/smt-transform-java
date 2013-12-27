package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ResourceSpecification extends CompositeTransformation {
    public static final String NAME = "resourceSpecification";

    public ResourceSpecification(Applyer applyer) {
        super(NAME, applyer);
    }
}
