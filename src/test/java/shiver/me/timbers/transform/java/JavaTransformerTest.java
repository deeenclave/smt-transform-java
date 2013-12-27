package shiver.me.timbers.transform.java;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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

        Assert.assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_SOURCE,
                new JavaTransformer(TestData.PARENT_TRANSFORMATIONS)
                        .transform(TestData.readTestFile(), TestData.ALL_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationKeywordsOnly() {

        Assert.assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_KEYWORDS_SOURCE,
                new JavaTransformer().transform(TestData.readTestFile(), TestData.KEYWORD_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationCommentsOnly() {

        Assert.assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_COMMENTS_SOURCE,
                new JavaTransformer().transform(TestData.readTestFile(), TestData.COMMENT_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithInvalidSource() {

        Assert.assertEquals("the source should be Transformed correctly.", TestData.TRANSFORMED_INVALID_SOURCE,
                new JavaTransformer(TestData.PARENT_TRANSFORMATIONS)
                        .transform(TestData.readTestFile(TestData.INVALID_TEST_FILE_NAME), TestData.ALL_TRANSFORMATIONS));
    }

    @Test
    public void testTransformationWithNoTransformations() {

        Assert.assertEquals("the source should be Transformed correctly.", TestData.SOURCE,
                new JavaTransformer().transform(TestData.readTestFile(), TestData.EMPTY_TRANSFORMATIONS)
        );
    }

    @Test
    public void testTransformationWithIrrelevantTransformations() {

        Assert.assertEquals("the source should be Transformed correctly.", TestData.SOURCE,
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
