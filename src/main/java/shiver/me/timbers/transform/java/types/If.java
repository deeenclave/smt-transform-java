package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class If extends CompositeTransformation {
    public static final String NAME = "'if'";

    public If(Applyer applyer) {
        super(NAME, applyer);
    }
}
