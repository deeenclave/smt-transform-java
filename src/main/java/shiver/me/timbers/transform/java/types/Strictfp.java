package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Strictfp extends CompositeTokenTransformation {
    public static final String NAME = "'strictfp'";

    public Strictfp(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
