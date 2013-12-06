package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Modifier extends CompositeTransformation {
    public static final String NAME = "modifier";

    public Modifier(Applyer applyer) {
        super(NAME, applyer);
    }
}
