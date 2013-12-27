package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Catch extends CompositeTransformation {
    public static final String NAME = "'catch'";

    public Catch(Applyer applyer) {
        super(NAME, applyer);
    }
}
