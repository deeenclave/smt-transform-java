package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class ConstDeclaration extends CompositeTransformation {
    public static final String NAME = "constDeclaration";

    public ConstDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
