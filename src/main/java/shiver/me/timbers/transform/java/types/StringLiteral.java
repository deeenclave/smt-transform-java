package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class StringLiteral extends CompositeTransformation {
    public static final String NAME = "StringLiteral";

    public StringLiteral(Applyer applyer) {
        super(NAME, applyer);
    }
}
