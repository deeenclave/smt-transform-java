package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EnumBodyDeclarations extends CompositeTokenTransformation {
    public static final String NAME = "enumBodyDeclarations";

    public EnumBodyDeclarations(TokenApplier applier) {
        super(NAME, applier);
    }
}
