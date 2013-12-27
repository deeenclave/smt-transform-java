package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class InnerCreator extends CompositeTransformation {
    public static final String NAME = "innerCreator";

    public InnerCreator(Applyer applyer) {
        super(NAME, applyer);
    }
}
