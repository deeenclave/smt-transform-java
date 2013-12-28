package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ClassOrInterfaceModifier extends CompositeTokenTransformation {
    public static final String NAME = "classOrInterfaceModifier";

    public ClassOrInterfaceModifier(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
