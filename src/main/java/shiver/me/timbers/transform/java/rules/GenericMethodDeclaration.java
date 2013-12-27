package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class GenericMethodDeclaration extends CompositeTransformation {
    public static final String NAME = "genericMethodDeclaration";

    public GenericMethodDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
