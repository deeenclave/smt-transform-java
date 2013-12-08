package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class FormalParameterList extends CompositeTransformation {
    public static final String NAME = "formalParameterList";

    public FormalParameterList(Applyer applyer) {
        super(NAME, applyer);
    }
}
