package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Switch extends CompositeTokenTransformation {
    public static final String NAME = "'switch'";

    public Switch(TokenApplier applier) {
        super(NAME, applier);
    }
}
