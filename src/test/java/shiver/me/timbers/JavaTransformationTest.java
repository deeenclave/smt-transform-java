package shiver.me.timbers;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.TestData.COMMENT_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.EMPTY_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.ERROR_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.INVALID_TEST_FILE_NAME;
import static shiver.me.timbers.TestData.KEYWORD_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.PARENT_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.SOURCE;
import static shiver.me.timbers.TestData.ALL_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.TRANSFORMED_COMMENTS_SOURCE;
import static shiver.me.timbers.TestData.TRANSFORMED_INVALID_SOURCE;
import static shiver.me.timbers.TestData.TRANSFORMED_KEYWORDS_SOURCE;
import static shiver.me.timbers.TestData.TRANSFORMED_SOURCE;
import static shiver.me.timbers.TestData.UNUSED_TRANSFORMATIONS;
import static shiver.me.timbers.TestData.readTestFile;

public class JavaTransformationTest {

    @Test
    public void testCreate() {

        new JavaTransformer(PARENT_TRANSFORMATIONS, ERROR_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullParentTransformations() {

        new JavaTransformer(null, ERROR_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullErrorTransformations() {

        new JavaTransformer(PARENT_TRANSFORMATIONS, null);
    }

    @Test
    public void testTransformation() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_SOURCE,
                new JavaTransformer(PARENT_TRANSFORMATIONS, ERROR_TRANSFORMATIONS)
                        .transform(readTestFile(), ALL_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationKeywordsOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_KEYWORDS_SOURCE,
                new JavaTransformer(EMPTY_TRANSFORMATIONS, EMPTY_TRANSFORMATIONS)
                        .transform(readTestFile(), KEYWORD_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationCommentsOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_COMMENTS_SOURCE,
                new JavaTransformer(EMPTY_TRANSFORMATIONS, COMMENT_TRANSFORMATIONS)
                        .transform(readTestFile(), EMPTY_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithInvalidSource() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_INVALID_SOURCE,
                new JavaTransformer(PARENT_TRANSFORMATIONS, ERROR_TRANSFORMATIONS)
                        .transform(readTestFile(INVALID_TEST_FILE_NAME), ALL_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithNoTransformations() {

        assertEquals("the source should be Transformed correctly.", SOURCE,
                new JavaTransformer(EMPTY_TRANSFORMATIONS, EMPTY_TRANSFORMATIONS)
                        .transform(readTestFile(), EMPTY_TRANSFORMATIONS)
        );
    }

    @Test
    public void testTransformationWithIrrelevantTransformations() {

        assertEquals("the source should be Transformed correctly.", SOURCE,
                new JavaTransformer(UNUSED_TRANSFORMATIONS, UNUSED_TRANSFORMATIONS)
                        .transform(readTestFile(), UNUSED_TRANSFORMATIONS));
    }

    @Test(expected = RuntimeException.class)
    public void testTransformationWithClosedStream() throws IOException {

        final InputStream closedStream = readTestFile();
        closedStream.close();

        new JavaTransformer(PARENT_TRANSFORMATIONS, ERROR_TRANSFORMATIONS).transform(closedStream, ALL_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testTransformationWithNullTransformations() {

        new JavaTransformer(PARENT_TRANSFORMATIONS, ERROR_TRANSFORMATIONS).transform(readTestFile(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformationWithNullInputStream() {

        new JavaTransformer(PARENT_TRANSFORMATIONS, ERROR_TRANSFORMATIONS).transform(null, ALL_TRANSFORMATIONS);
    }
}
