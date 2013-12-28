package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Assert extends CompositeTokenTransformation {
    public static final String NAME = "'assert'";

    public Assert(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
