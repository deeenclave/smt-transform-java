package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Catch extends CompositeTransformation {
    public static final String NAME = "'catch'";

    public Catch(Applyer applyer) {
        super(NAME, applyer);
    }
}
