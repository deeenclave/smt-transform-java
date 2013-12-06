package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Double extends CompositeTransformation {
    public static final String NAME = "'double'";

    public Double(Applyer applyer) {
        super(NAME, applyer);
    }
}
