package shiver.me.timbers;

import shiver.me.timbers.types.Comment;
import shiver.me.timbers.types.JavaDoc;
import shiver.me.timbers.types.LineComment;

import java.util.HashSet;
import java.util.Set;

import static shiver.me.timbers.JavaParser.COMMENT;
import static shiver.me.timbers.JavaParser.JAVA_DOC;
import static shiver.me.timbers.JavaParser.LINE_COMMENT;

/**
 * This class contains constants to help with parsing Java comments.
 *
 * @author Karl Bennett
 */
public final class Comments {

    private Comments() {
    }

    /**
     * The Java comment types.
     */
    public static final Set<String> COMMENT_NAMES = new HashSet<String>() {{
        add(Comment.NAME);
        add(JavaDoc.NAME);
        add(LineComment.NAME);
    }};

    public static final Set<Integer> COMMENT_TYPES = new HashSet<Integer>() {{
        add(COMMENT);
        add(JAVA_DOC);
        add(LINE_COMMENT);
    }};

    /**
     * Check is the supplied name is that of a comment.
     */
    public static boolean isComment(String name) {

        return COMMENT_NAMES.contains(name);
    }

    /**
     * Check is the supplied type int is for a comment.
     */
    public static boolean isComment(int type) {

        return COMMENT_TYPES.contains(type);
    }
}
