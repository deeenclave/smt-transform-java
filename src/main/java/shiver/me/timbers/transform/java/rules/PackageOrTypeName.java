package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class PackageOrTypeName extends CompositeTokenTransformation {
    public static final String NAME = "packageOrTypeName";

    public PackageOrTypeName(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
