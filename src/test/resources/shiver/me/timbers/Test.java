package shiver.me.timbers;

/**
 * This class has been created to provide some example source for Transformationing.
 *
 * @author Karl Bennett
 */
public class Test {

    /*
    * This is a multi line comment.
    */
    private final String test;

    public Test(String test) {

        this.test = test;
    }

    public String getTest() {

        return test;
    }

    public String append(int number) {

        // This is a comment.
        return test + number;
    }

    public static int increment(int number) {

        return number + 1;
    }
}
