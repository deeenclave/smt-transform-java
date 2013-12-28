package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForControl extends CompositeTokenTransformation {
    public static final String NAME = "forControl";

    public ForControl(TokenApplier applier) {
        super(NAME, applier);
    }
}
