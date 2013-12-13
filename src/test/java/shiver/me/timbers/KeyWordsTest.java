package shiver.me.timbers;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class KeyWordsTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        final Constructor<KeyWords> constructor = KeyWords.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
