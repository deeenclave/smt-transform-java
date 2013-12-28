package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Resources extends CompositeTokenTransformation {
    public static final String NAME = "resources";

    public Resources(TokenApplier applier) {
        super(NAME, applier);
    }
}
