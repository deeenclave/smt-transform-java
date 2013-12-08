package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Transient extends CompositeTransformation {
    public static final String NAME = "'transient'";

    public Transient(Applyer applyer) {
        super(NAME, applyer);
    }
}
