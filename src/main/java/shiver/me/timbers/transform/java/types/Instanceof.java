package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Instanceof extends CompositeTokenTransformation {
    public static final String NAME = "'instanceof'";

    public Instanceof(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
