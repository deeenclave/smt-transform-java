package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class FieldDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "fieldDeclaration";

    public FieldDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
