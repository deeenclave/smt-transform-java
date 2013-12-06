package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassBodyDeclaration extends CompositeTransformation {
    public static final String NAME = "classBodyDeclaration";

    public ClassBodyDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
