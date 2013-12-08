package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class IntegerLiteral extends CompositeTransformation {
    public static final String NAME = "IntegerLiteral";

    public IntegerLiteral(Applyer applyer) {
        super(NAME, applyer);
    }
}
