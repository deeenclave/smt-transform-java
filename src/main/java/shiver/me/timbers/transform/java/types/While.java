package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class While extends CompositeTransformation {
    public static final String NAME = "'while'";

    public While(Applyer applyer) {
        super(NAME, applyer);
    }
}
