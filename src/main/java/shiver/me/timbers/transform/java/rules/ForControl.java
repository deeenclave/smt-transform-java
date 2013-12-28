package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ForControl extends CompositeTokenTransformation {
    public static final String NAME = "forControl";

    public ForControl(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
