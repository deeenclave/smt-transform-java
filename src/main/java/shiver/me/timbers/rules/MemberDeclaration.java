package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class MemberDeclaration extends CompositeTransformation {
    public static final String NAME = "memberDeclaration";

    public MemberDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
