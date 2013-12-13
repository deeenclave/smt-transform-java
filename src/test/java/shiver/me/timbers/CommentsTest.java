package shiver.me.timbers;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommentsTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        final Constructor<Comments> constructor = Comments.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
