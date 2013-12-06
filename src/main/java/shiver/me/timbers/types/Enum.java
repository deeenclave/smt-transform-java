package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Enum extends CompositeTransformation {
    public static final String NAME = "'enum'";

    public Enum(Applyer applyer) {
        super(NAME, applyer);
    }
}
