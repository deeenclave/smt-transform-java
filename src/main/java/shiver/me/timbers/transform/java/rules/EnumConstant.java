package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EnumConstant extends CompositeTokenTransformation {
    public static final String NAME = "enumConstant";

    public EnumConstant(TokenApplier applier) {
        super(NAME, applier);
    }
}
