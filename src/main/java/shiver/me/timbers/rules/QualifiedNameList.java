package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class QualifiedNameList extends CompositeTransformation {
    public static final String NAME = "qualifiedNameList";

    public QualifiedNameList(Applyer applyer) {
        super(NAME, applyer);
    }
}
