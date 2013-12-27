package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class CreatedName extends CompositeTransformation {
    public static final String NAME = "createdName";

    public CreatedName(Applyer applyer) {
        super(NAME, applyer);
    }
}
