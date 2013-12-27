package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Type extends CompositeTransformation {
    public static final String NAME = "type";

    public Type(Applyer applyer) {
        super(NAME, applyer);
    }
}
