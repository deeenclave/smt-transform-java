package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ClassOrInterfaceType extends CompositeTokenTransformation {
    public static final String NAME = "classOrInterfaceType";

    public ClassOrInterfaceType(TokenApplier applier) {
        super(NAME, applier);
    }
}
