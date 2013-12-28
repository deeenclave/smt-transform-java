package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ClassDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "classDeclaration";

    public ClassDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
