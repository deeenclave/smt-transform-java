package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class StringLiteral extends CompositeTransformation {
    public static final String NAME = "StringLiteral";

    public StringLiteral(Applyer applyer) {
        super(NAME, applyer);
    }
}
