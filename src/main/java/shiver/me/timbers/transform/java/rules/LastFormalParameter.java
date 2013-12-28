package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class LastFormalParameter extends CompositeTokenTransformation {
    public static final String NAME = "lastFormalParameter";

    public LastFormalParameter(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
