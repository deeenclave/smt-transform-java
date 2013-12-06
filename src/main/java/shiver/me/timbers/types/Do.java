package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Do extends CompositeTransformation {
    public static final String NAME = "'do'";

    public Do(Applyer applyer) {
        super(NAME, applyer);
    }
}
