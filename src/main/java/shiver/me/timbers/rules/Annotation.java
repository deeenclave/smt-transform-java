package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Annotation extends CompositeTransformation {
    public static final String NAME = "annotation";

    public Annotation(Applyer applyer) {
        super(NAME, applyer);
    }
}
