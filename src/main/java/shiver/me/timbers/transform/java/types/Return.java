package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Return extends CompositeTokenTransformation {
    public static final String NAME = "'return'";

    public Return(TokenApplier applier) {
        super(NAME, applier);
    }
}
