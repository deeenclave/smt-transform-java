package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Abstract extends CompositeTokenTransformation {
    public static final String NAME = "'abstract'";

    public Abstract(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
