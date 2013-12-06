package shiver.me.timbers;

import org.junit.Test;
import shiver.me.timbers.types.Comment;
import shiver.me.timbers.types.Goto;
import shiver.me.timbers.types.JavaDoc;
import shiver.me.timbers.types.LineComment;
import shiver.me.timbers.types.Package;
import shiver.me.timbers.types.This;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static shiver.me.timbers.Comments.isComment;

/**
 * @author Karl Bennett
 */
public class CommentsTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        final Constructor<Comments> constructor = Comments.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void testIsCommentWithCommentInt() {

        assertTrue("a comment type should be true.", isComment(JavaParser.COMMENT));
        assertTrue("a java doc type should be true.", isComment(JavaParser.JAVA_DOC));
        assertTrue("a line comment type should be true.", isComment(JavaParser.LINE_COMMENT));
    }

    @Test
    public void testIsCommentWithNonCommentInt() {

        assertFalse("a this type should be false.", isComment(JavaParser.THIS));
        assertFalse("a package type should be false.", isComment(JavaParser.PACKAGE));
        assertFalse("a goto type should be false.", isComment(JavaParser.GOTO));
    }

    @Test
    public void testIsCommentWithCommentName() {

        assertTrue("a comment name should be true.", isComment(Comment.NAME));
        assertTrue("a java doc name should be true.", isComment(JavaDoc.NAME));
        assertTrue("a line comment name should be true.", isComment(LineComment.NAME));
    }

    @Test
    public void testIsCommentWithNonCommentName() {

        assertFalse("a this name should be false.", isComment(This.NAME));
        assertFalse("a package name should be false.", isComment(Package.NAME));
        assertFalse("a goto name should be false.", isComment(Goto.NAME));
    }
}
