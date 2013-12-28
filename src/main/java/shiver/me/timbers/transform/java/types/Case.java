package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Case extends CompositeTokenTransformation {
    public static final String NAME = "'case'";

    public Case(TokenApplier applier) {
        super(NAME, applier);
    }
}
