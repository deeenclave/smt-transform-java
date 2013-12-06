package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class PackageOrTypeName extends CompositeTransformation {
    public static final String NAME = "packageOrTypeName";

    public PackageOrTypeName(Applyer applyer) {
        super(NAME, applyer);
    }
}
