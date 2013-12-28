package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class TypeName extends CompositeTokenTransformation {
    public static final String NAME = "typeName";

    public TypeName(TokenApplier applier) {
        super(NAME, applier);
    }
}
