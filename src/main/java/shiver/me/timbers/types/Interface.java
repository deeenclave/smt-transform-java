package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Interface extends CompositeTransformation {
    public static final String NAME = "'interface'";

    public Interface(Applyer applyer) {
        super(NAME, applyer);
    }
}
