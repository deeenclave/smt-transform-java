package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class NonWildcardTypeArguments extends CompositeTransformation {
    public static final String NAME = "nonWildcardTypeArguments";

    public NonWildcardTypeArguments(Applyer applyer) {
        super(NAME, applyer);
    }
}
