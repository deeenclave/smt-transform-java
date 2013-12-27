package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Goto extends CompositeTransformation {
    public static final String NAME = "'goto'";

    public Goto(Applyer applyer) {
        super(NAME, applyer);
    }
}
