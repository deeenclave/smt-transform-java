package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class This extends CompositeTransformation {
    public static final String NAME = "'this'";

    public This(Applyer applyer) {
        super(NAME, applyer);
    }
}
