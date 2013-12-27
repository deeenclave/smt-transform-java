package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Comment extends CompositeTransformation {
    public static final String NAME = "COMMENT";

    public Comment(Applyer applyer) {
        super(NAME, applyer);
    }
}
