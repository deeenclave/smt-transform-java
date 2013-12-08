package shiver.me.timbers;

import org.junit.Test;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.types.Const;
import shiver.me.timbers.types.Goto;
import shiver.me.timbers.types.Strictfp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.TestData.INVALID_TEST_FILE_NAME;
import static shiver.me.timbers.TestData.MOCK_APPLYER;
import static shiver.me.timbers.TestData.SOURCE;
import static shiver.me.timbers.TestData.TRANSFORMATIONS;
import static shiver.me.timbers.TestData.Transformed_INVALID_SOURCE;
import static shiver.me.timbers.TestData.Transformed_SOURCE;
import static shiver.me.timbers.TestData.readTestFile;

public class JavaTransformationTest {

    @Test
    public void testTransformation() {

        assertEquals("the source should be Transformed correctly.", Transformed_SOURCE,
                new JavaTransformer().transform(readTestFile(), TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithInvalidSource() {

        assertEquals("the source should be Transformed correctly.", Transformed_INVALID_SOURCE,
                new JavaTransformer().transform(readTestFile(INVALID_TEST_FILE_NAME), TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithNoTransformations() {

        assertEquals("the source should be Transformed correctly.", SOURCE,
                new JavaTransformer().transform(readTestFile(),
                        new IndividualTransformations(Collections.<Transformation>emptyList())
                )
        );
    }

    @Test
    public void testTransformationWithIrrelevantTransformations() {

        assertEquals("the source should be Transformed correctly.", SOURCE,
                new JavaTransformer().transform(readTestFile(),
                        new IndividualTransformations(Arrays.<Transformation>asList(
                                new Const(MOCK_APPLYER),
                                new Goto(MOCK_APPLYER),
                                new Strictfp(MOCK_APPLYER)
                        ))
                )
        );
    }

    @Test(expected = RuntimeException.class)
    public void testTransformationWithClosedStream() throws IOException {

        final InputStream closedStream = readTestFile();
        closedStream.close();

        new JavaTransformer().transform(closedStream, TRANSFORMATIONS);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformationWithNullTransformations() {

        new JavaTransformer().transform(readTestFile(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformationWithNullInputStream() {

        new JavaTransformer().transform(null, TRANSFORMATIONS);
    }
}
