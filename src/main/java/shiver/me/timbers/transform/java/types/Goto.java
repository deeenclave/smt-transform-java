package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Goto extends CompositeTokenTransformation {
    public static final String NAME = "'goto'";

    public Goto(TokenApplier applier) {
        super(NAME, applier);
    }
}
