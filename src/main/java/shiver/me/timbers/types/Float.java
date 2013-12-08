package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Float extends CompositeTransformation {
    public static final String NAME = "'float'";

    public Float(Applyer applyer) {
        super(NAME, applyer);
    }
}
