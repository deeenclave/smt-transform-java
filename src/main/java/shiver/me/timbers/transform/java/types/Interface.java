package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Interface extends CompositeTokenTransformation {
    public static final String NAME = "'interface'";

    public Interface(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
