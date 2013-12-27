package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class QualifiedNameList extends CompositeTransformation {
    public static final String NAME = "qualifiedNameList";

    public QualifiedNameList(Applyer applyer) {
        super(NAME, applyer);
    }
}
