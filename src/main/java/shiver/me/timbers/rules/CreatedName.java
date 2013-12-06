package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class CreatedName extends CompositeTransformation {
    public static final String NAME = "createdName";

    public CreatedName(Applyer applyer) {
        super(NAME, applyer);
    }
}
