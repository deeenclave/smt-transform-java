package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class QualifiedName extends CompositeTransformation {
    public static final String NAME = "qualifiedName";

    public QualifiedName(Applyer applyer) {
        super(NAME, applyer);
    }
}
