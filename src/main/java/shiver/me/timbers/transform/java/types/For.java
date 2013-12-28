package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class For extends CompositeTokenTransformation {
    public static final String NAME = "'for'";

    public For(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
