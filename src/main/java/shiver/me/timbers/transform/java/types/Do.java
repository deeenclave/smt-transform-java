package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Do extends CompositeTransformation {
    public static final String NAME = "'do'";

    public Do(Applyer applyer) {
        super(NAME, applyer);
    }
}
