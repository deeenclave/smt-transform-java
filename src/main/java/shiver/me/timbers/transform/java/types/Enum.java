package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Enum extends CompositeTokenTransformation {
    public static final String NAME = "'enum'";

    public Enum(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
