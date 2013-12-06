package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class FormalParameterList extends CompositeTransformation {
    public static final String NAME = "formalParameterList";

    public FormalParameterList(Applyer applyer) {
        super(NAME, applyer);
    }
}
