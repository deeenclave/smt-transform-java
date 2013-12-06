package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class QualifiedName extends CompositeTransformation {
    public static final String NAME = "qualifiedName";

    public QualifiedName(Applyer applyer) {
        super(NAME, applyer);
    }
}
