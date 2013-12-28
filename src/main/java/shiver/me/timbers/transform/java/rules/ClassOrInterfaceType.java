package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ClassOrInterfaceType extends CompositeTokenTransformation {
    public static final String NAME = "classOrInterfaceType";

    public ClassOrInterfaceType(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
