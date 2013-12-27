package shiver.me.timbers.transform.java;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class JavaTransformerTest {

    @Test
    public void testCreate() {

        new JavaTransformer();
    }

    @Test
    public void testCreateWithParentTransformations() {

        new JavaTransformer(TestData.PARENT_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testCreateWithNullParentTransformations() {

        new JavaTransformer(null);
    }

    @Test
    public void testTransformation() {

        assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_SOURCE,
                new JavaTransformer(TestData.PARENT_TRANSFORMATIONS)
                        .transform(TestData.readTestFile(), TestData.ALL_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationKeywordsOnly() {

        assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_KEYWORDS_SOURCE,
                new JavaTransformer().transform(TestData.readTestFile(), TestData.KEYWORD_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationCommentsOnly() {

        assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_COMMENTS_SOURCE,
                new JavaTransformer().transform(TestData.readTestFile(), TestData.COMMENT_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithInvalidSource() {

        assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_INVALID_SOURCE,
                new JavaTransformer(TestData.PARENT_TRANSFORMATIONS)
                        .transform(TestData.readTestFile(TestData.INVALID_TEST_FILE_NAME), TestData.ALL_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithNoTransformations() {

        assertEquals("the source should be Transformed correctly.", TestData.SOURCE,
                new JavaTransformer().transform(TestData.readTestFile(), TestData.EMPTY_TRANSFORMATIONS)
        );
    }

    @Test
    public void testTransformationWithIrrelevantTransformations() {

        assertEquals("the source should be Transformed correctly.", TestData.SOURCE,
                new JavaTransformer(TestData.UNUSED_TRANSFORMATIONS)
                        .transform(TestData.readTestFile(), TestData.UNUSED_TRANSFORMATIONS));
    }

    @Test(expected = RuntimeException.class)
    public void testTransformationWithClosedStream() throws IOException {

        final InputStream closedStream = TestData.readTestFile();
        closedStream.close();

        new JavaTransformer().transform(closedStream, TestData.ALL_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testTransformationWithNullTransformations() {

        new JavaTransformer().transform(TestData.readTestFile(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformationWithNullInputStream() {

        new JavaTransformer().transform(null, TestData.ALL_TRANSFORMATIONS);
    }
}
