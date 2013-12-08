package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class FloatingPointLiteral extends CompositeTransformation {
    public static final String NAME = "FloatingPointLiteral";

    public FloatingPointLiteral(Applyer applyer) {
        super(NAME, applyer);
    }
}
