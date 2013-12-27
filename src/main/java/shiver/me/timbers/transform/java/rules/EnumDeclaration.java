package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class EnumDeclaration extends CompositeTransformation {
    public static final String NAME = "enumDeclaration";

    public EnumDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
