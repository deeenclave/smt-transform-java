package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CompilationUnit extends CompositeTokenTransformation {
    public static final String NAME = "compilationUnit";

    public CompilationUnit(TokenApplier applier) {
        super(NAME, applier);
    }
}
