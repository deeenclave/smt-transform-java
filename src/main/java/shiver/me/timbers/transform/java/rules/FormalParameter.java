package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class FormalParameter extends CompositeTokenTransformation {
    public static final String NAME = "formalParameter";

    public FormalParameter(TokenApplier applier) {
        super(NAME, applier);
    }
}
