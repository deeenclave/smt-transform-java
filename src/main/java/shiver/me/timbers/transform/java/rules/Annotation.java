package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Annotation extends CompositeTokenTransformation {
    public static final String NAME = "annotation";

    public Annotation(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
