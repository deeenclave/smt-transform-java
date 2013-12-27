package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Return extends CompositeTransformation {
    public static final String NAME = "'return'";

    public Return(Applyer applyer) {
        super(NAME, applyer);
    }
}
