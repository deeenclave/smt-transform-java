package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class LocalVariableDeclarationStatement extends CompositeTransformation {
    public static final String NAME = "localVariableDeclarationStatement";

    public LocalVariableDeclarationStatement(Applyer applyer) {
        super(NAME, applyer);
    }
}
