package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class TypeList extends CompositeTransformation {
    public static final String NAME = "typeList";

    public TypeList(Applyer applyer) {
        super(NAME, applyer);
    }
}
