package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class TypeParameter extends CompositeTokenTransformation {
    public static final String NAME = "typeParameter";

    public TypeParameter(TokenApplier applier) {
        super(NAME, applier);
    }
}
