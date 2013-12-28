package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class InterfaceBody extends CompositeTokenTransformation {
    public static final String NAME = "interfaceBody";

    public InterfaceBody(TokenApplier applier) {
        super(NAME, applier);
    }
}
