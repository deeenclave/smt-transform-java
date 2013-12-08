package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class CompilationUnit extends CompositeTransformation {
    public static final String NAME = "compilationUnit";

    public CompilationUnit(Applyer applyer) {
        super(NAME, applyer);
    }
}
