package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class JavaDoc extends CompositeTransformation {
    public static final String NAME = "JAVA_DOC";

    public JavaDoc(Applyer applyer) {
        super(NAME, applyer);
    }
}
