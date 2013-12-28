package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class MemberDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "memberDeclaration";

    public MemberDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
