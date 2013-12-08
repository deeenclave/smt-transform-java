package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassBodyDeclaration extends CompositeTransformation {
    public static final String NAME = "classBodyDeclaration";

    public ClassBodyDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
