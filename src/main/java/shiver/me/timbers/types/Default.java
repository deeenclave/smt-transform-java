package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Default extends CompositeTransformation {
    public static final String NAME = "'default'";

    public Default(Applyer applyer) {
        super(NAME, applyer);
    }
}
