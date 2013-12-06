package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Comment extends CompositeTransformation {
    public static final String NAME = "COMMENT";

    public Comment(Applyer applyer) {
        super(NAME, applyer);
    }
}
