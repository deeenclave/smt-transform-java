package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Modifier extends CompositeTransformation {
    public static final String NAME = "modifier";

    public Modifier(Applyer applyer) {
        super(NAME, applyer);
    }
}
