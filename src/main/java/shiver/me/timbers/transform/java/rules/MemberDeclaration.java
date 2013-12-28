package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class MemberDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "memberDeclaration";

    public MemberDeclaration(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
