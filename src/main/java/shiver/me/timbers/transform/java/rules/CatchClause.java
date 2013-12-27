package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class CatchClause extends CompositeTransformation {
    public static final String NAME = "catchClause";

    public CatchClause(Applyer applyer) {
        super(NAME, applyer);
    }
}
