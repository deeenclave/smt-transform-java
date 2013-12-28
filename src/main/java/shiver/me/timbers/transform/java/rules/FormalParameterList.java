package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class FormalParameterList extends CompositeTokenTransformation {
    public static final String NAME = "formalParameterList";

    public FormalParameterList(TokenApplier applier) {
        super(NAME, applier);
    }
}
