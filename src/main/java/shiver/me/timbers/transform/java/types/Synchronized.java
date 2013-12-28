package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Synchronized extends CompositeTokenTransformation {
    public static final String NAME = "'synchronized'";

    public Synchronized(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
