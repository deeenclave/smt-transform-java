package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Float extends CompositeTokenTransformation {
    public static final String NAME = "'float'";

    public Float(TokenApplier applier) {
        super(NAME, applier);
    }
}
