package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class This extends CompositeTransformation {
    public static final String NAME = "'this'";

    public This(Applyer applyer) {
        super(NAME, applyer);
    }
}
