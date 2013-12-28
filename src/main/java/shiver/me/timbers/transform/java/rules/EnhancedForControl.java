package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EnhancedForControl extends CompositeTokenTransformation {
    public static final String NAME = "enhancedForControl";

    public EnhancedForControl(TokenApplier applier) {
        super(NAME, applier);
    }
}
