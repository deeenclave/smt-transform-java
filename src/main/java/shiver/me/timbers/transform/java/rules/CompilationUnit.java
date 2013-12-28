package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class CompilationUnit extends CompositeTokenTransformation {
    public static final String NAME = "compilationUnit";

    public CompilationUnit(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
