package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class FormalParameterList extends CompositeTokenTransformation {
    public static final String NAME = "formalParameterList";

    public FormalParameterList(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
