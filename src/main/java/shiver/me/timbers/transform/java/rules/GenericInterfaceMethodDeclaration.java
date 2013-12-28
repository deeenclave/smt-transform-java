package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class GenericInterfaceMethodDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "genericInterfaceMethodDeclaration";

    public GenericInterfaceMethodDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
