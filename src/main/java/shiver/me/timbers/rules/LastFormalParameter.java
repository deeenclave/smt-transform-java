package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class LastFormalParameter extends CompositeTransformation {
    public static final String NAME = "lastFormalParameter";

    public LastFormalParameter(Applyer applyer) {
        super(NAME, applyer);
    }
}
