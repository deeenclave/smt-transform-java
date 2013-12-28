package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class QualifiedNameList extends CompositeTokenTransformation {
    public static final String NAME = "qualifiedNameList";

    public QualifiedNameList(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
