package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class PackageDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "packageDeclaration";

    public PackageDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
