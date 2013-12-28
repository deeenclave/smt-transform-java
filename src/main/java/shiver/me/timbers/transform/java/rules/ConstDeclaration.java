package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ConstDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "constDeclaration";

    public ConstDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
