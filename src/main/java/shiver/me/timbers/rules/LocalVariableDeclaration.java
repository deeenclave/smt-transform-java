package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class LocalVariableDeclaration extends CompositeTransformation {
    public static final String NAME = "localVariableDeclaration";

    public LocalVariableDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
