package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class QualifiedName extends CompositeTokenTransformation {
    public static final String NAME = "qualifiedName";

    public QualifiedName(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
