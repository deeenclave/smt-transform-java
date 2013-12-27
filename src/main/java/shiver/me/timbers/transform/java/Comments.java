package shiver.me.timbers.transform.java;

import shiver.me.timbers.transform.java.types.Comment;
import shiver.me.timbers.transform.java.types.JavaDoc;
import shiver.me.timbers.transform.java.types.LineComment;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains constants to help with parsing Java comments.
 */
public final class Comments {

    private Comments() {
    }

    /**
     * All the names of the Java comment types.
     */
    public static final List<String> COMMENT_NAMES = new ArrayList<String>() {{
        add(Comment.NAME);
        add(JavaDoc.NAME);
        add(LineComment.NAME);
    }};
}
