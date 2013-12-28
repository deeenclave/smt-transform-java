package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Annotation extends CompositeTokenTransformation {
    public static final String NAME = "annotation";

    public Annotation(TokenApplier applier) {
        super(NAME, applier);
    }
}
