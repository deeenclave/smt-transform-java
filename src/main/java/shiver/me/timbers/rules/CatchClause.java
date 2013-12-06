package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class CatchClause extends CompositeTransformation {
    public static final String NAME = "catchClause";

    public CatchClause(Applyer applyer) {
        super(NAME, applyer);
    }
}
