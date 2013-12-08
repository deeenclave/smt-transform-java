package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class BooleanLiteral extends CompositeTransformation {
    public static final String NAME = "BooleanLiteral";

    public BooleanLiteral(Applyer applyer) {
        super(NAME, applyer);
    }
}
