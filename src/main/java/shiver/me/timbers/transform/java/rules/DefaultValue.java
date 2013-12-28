package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class DefaultValue extends CompositeTokenTransformation {
    public static final String NAME = "defaultValue";

    public DefaultValue(TokenApplier applier) {
        super(NAME, applier);
    }
}
