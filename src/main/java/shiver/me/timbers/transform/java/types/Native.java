package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Native extends CompositeTokenTransformation {
    public static final String NAME = "'native'";

    public Native(TokenApplier applier) {
        super(NAME, applier);
    }
}
