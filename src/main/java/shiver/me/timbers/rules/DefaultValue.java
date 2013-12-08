package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class DefaultValue extends CompositeTransformation {
    public static final String NAME = "defaultValue";

    public DefaultValue(Applyer applyer) {
        super(NAME, applyer);
    }
}
