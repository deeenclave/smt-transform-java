package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class TypeDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "typeDeclaration";

    public TypeDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
