package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class TypeList extends CompositeTokenTransformation {
    public static final String NAME = "typeList";

    public TypeList(TokenApplier applier) {
        super(NAME, applier);
    }
}
