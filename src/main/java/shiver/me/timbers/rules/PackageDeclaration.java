package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class PackageDeclaration extends CompositeTransformation {
    public static final String NAME = "packageDeclaration";

    public PackageDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
