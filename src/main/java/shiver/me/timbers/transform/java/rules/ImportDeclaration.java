package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ImportDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "importDeclaration";

    public ImportDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
