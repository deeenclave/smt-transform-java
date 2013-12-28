package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LocalVariableDeclarationStatement extends CompositeTokenTransformation {
    public static final String NAME = "localVariableDeclarationStatement";

    public LocalVariableDeclarationStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
