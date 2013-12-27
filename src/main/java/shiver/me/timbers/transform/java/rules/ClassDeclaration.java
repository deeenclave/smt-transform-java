package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ClassDeclaration extends CompositeTransformation {
    public static final String NAME = "classDeclaration";

    public ClassDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
