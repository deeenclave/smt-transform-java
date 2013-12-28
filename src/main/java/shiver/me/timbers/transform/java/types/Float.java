package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Float extends CompositeTokenTransformation {
    public static final String NAME = "'float'";

    public Float(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
