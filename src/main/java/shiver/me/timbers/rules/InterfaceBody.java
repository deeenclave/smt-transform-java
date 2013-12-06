package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class InterfaceBody extends CompositeTransformation {
    public static final String NAME = "interfaceBody";

    public InterfaceBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
