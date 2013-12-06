package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Goto extends CompositeTransformation {
    public static final String NAME = "'goto'";

    public Goto(Applyer applyer) {
        super(NAME, applyer);
    }
}
