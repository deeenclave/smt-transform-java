package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Annotation extends CompositeTransformation {
    public static final String NAME = "annotation";

    public Annotation(Applyer applyer) {
        super(NAME, applyer);
    }
}
