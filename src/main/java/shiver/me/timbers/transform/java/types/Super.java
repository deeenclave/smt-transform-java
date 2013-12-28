package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Super extends CompositeTokenTransformation {
    public static final String NAME = "'super'";

    public Super(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
