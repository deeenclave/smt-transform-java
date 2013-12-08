package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Case extends CompositeTransformation {
    public static final String NAME = "'case'";

    public Case(Applyer applyer) {
        super(NAME, applyer);
    }
}
