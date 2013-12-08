package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class NonWildcardTypeArguments extends CompositeTransformation {
    public static final String NAME = "nonWildcardTypeArguments";

    public NonWildcardTypeArguments(Applyer applyer) {
        super(NAME, applyer);
    }
}
