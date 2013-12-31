package shiver.me.timbers.transform.java;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.StaticNameListBuilder;
import shiver.me.timbers.transform.java.types.Comment;
import shiver.me.timbers.transform.java.types.JavaDoc;
import shiver.me.timbers.transform.java.types.LineComment;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * This class contains constants to help with parsing Java comments.
 */
public final class Comments {

    private Comments() {
    }

    /**
     * All the names of the Java comment types.
     */
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends CompositeTokenTransformation>> COMMENTS = unmodifiableList(
            asList(Comment.class, JavaDoc.class, LineComment.class));

    @SuppressWarnings("unchecked")
    public static final List<String> COMMENT_NAMES = unmodifiableList(
            new StaticNameListBuilder((Iterable) COMMENTS).build());
}
