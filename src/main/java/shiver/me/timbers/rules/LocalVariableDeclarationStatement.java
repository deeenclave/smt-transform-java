package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class LocalVariableDeclarationStatement extends CompositeTransformation {
    public static final String NAME = "localVariableDeclarationStatement";

    public LocalVariableDeclarationStatement(Applyer applyer) {
        super(NAME, applyer);
    }
}
