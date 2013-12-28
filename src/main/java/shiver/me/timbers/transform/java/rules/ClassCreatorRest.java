package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ClassCreatorRest extends CompositeTokenTransformation {
    public static final String NAME = "classCreatorRest";

    public ClassCreatorRest(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
