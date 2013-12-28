package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EnumDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "enumDeclaration";

    public EnumDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
