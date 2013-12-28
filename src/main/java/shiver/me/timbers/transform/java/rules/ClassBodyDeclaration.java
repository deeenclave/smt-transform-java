package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ClassBodyDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "classBodyDeclaration";

    public ClassBodyDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
