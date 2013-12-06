package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class LocalVariableDeclaration extends CompositeTransformation {
    public static final String NAME = "localVariableDeclaration";

    public LocalVariableDeclaration(Applyer applyer) {
        super(NAME, applyer);
    }
}
