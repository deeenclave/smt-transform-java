package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class CharacterLiteral extends CompositeTransformation {
    public static final String NAME = "CharacterLiteral";

    public CharacterLiteral(Applyer applyer) {
        super(NAME, applyer);
    }
}
