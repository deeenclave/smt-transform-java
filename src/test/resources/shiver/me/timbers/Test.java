package shiver.me.timbers;

import java.io.Serializable;

/**
 * This class has been created to provide some example source for Transforming.
 *
 * @author Karl Bennett
 */
public abstract class Test extends Object implements Serializable {

    /*
    * This is a multi line comment.
    */
    private final transient String test;
    protected volatile byte aByte;
    protected short aShort;
    protected int anInt;
    protected long aLong;
    protected float aFloat;
    protected double aDouble;

    enum ENUM {
        ONE,
        TWO
    }

    public Test(String test) {
        super();

        assert null != test;

        this.test = test;
    }

    public String getTest() throws RuntimeException {

        return test;
    }

    public boolean append(char number) {

        try {

            // This is a comment.
            return test + number == "2";

        } catch (Exception e) {

            throw new RuntimeException(e);

        } finally {

            System.out.println("done.");
        }
    }

    public static int increment(int number) {

        final Object object = new Object();

        for (int i = 0; i < 10; i++) {

            number++;

            if (object instanceof Double) continue;
            else {

                number--;
            }

            switch(i) {
                case 9: break;
                default: number = 0;
            }
        }

        do {

        } while(-1 > number);

        return number;
    }

    public synchronized native void method();
}
