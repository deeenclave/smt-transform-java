package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class InterfaceBody extends CompositeTransformation {
    public static final String NAME = "interfaceBody";

    public InterfaceBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
