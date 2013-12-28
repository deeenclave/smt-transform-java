package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class TypeParameter extends CompositeTokenTransformation {
    public static final String NAME = "typeParameter";

    public TypeParameter(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
