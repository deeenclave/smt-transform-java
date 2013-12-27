package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Interface extends CompositeTransformation {
    public static final String NAME = "'interface'";

    public Interface(Applyer applyer) {
        super(NAME, applyer);
    }
}
