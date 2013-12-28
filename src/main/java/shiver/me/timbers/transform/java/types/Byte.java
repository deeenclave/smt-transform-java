package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Byte extends CompositeTokenTransformation {
    public static final String NAME = "'byte'";

    public Byte(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
