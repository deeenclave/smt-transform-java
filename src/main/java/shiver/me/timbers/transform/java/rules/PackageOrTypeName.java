package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class PackageOrTypeName extends CompositeTokenTransformation {
    public static final String NAME = "packageOrTypeName";

    public PackageOrTypeName(TokenApplier applier) {
        super(NAME, applier);
    }
}
