package shiver.me.timbers.transform.java;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.TransformerTestTemplate;

import java.io.IOException;

import static shiver.me.timbers.transform.java.FileConstants.INVALID_TEST_FILE_NAME;
import static shiver.me.timbers.transform.java.FileConstants.SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.TRANSFORMED_COMMENTS_SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.TRANSFORMED_INVALID_SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.TRANSFORMED_KEYWORDS_SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.TRANSFORMED_RULES_SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.TRANSFORMED_SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.TRANSFORMED_TYPES_SOURCE;
import static shiver.me.timbers.transform.java.FileConstants.readTestFile;
import static shiver.me.timbers.transform.java.TransformationsConstants.ALL_TRANSFORMATIONS;
import static shiver.me.timbers.transform.java.TransformationsConstants.COMMENT_TRANSFORMATIONS;
import static shiver.me.timbers.transform.java.TransformationsConstants.KEYWORD_TRANSFORMATIONS;
import static shiver.me.timbers.transform.java.TransformationsConstants.PARENT_TRANSFORMATIONS;
import static shiver.me.timbers.transform.java.TransformationsConstants.RULES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.java.TransformationsConstants.TYPES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.java.TransformationsConstants.UNUSED_TRANSFORMATIONS;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformCommentsOnlyTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformKeywordsOnlyTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithClosedStreamTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithInvalidSourceTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithIrrelevantTransformationsTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithNoTransformationsTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithNullInputStreamTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithNullTransformationsTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithRulesOnlyTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithTypesOnlyTest;

public class JavaTransformerTest implements TransformerTestTemplate {

    @Test
    @Override
    public void testCreate() {

        new JavaTransformer();
    }

    @Test
    @Override
    public void testCreateWithParentTransformations() {

        new JavaTransformer(PARENT_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testCreateWithNullParentTransformations() {

        new JavaTransformer(null);
    }

    @Test
    @Override
    public void testTransform() {

        transformTest(TRANSFORMED_SOURCE, new JavaTransformer(PARENT_TRANSFORMATIONS), readTestFile(),
                ALL_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformKeywordsOnly() {

        transformKeywordsOnlyTest(TRANSFORMED_KEYWORDS_SOURCE, new JavaTransformer(), readTestFile(),
                KEYWORD_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformCommentsOnly() {

        transformCommentsOnlyTest(TRANSFORMED_COMMENTS_SOURCE, new JavaTransformer(), readTestFile(),
                COMMENT_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithInvalidSource() {

        transformWithInvalidSourceTest(TRANSFORMED_INVALID_SOURCE, new JavaTransformer(PARENT_TRANSFORMATIONS),
                readTestFile(INVALID_TEST_FILE_NAME), ALL_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithTypesOnly() {

        transformWithTypesOnlyTest(TRANSFORMED_TYPES_SOURCE, new JavaTransformer(), readTestFile(),
                TYPES_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithRulesOnly() {

        transformWithRulesOnlyTest(TRANSFORMED_RULES_SOURCE, new JavaTransformer(), readTestFile(),
                RULES_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithNoTransformations() {

        transformWithNoTransformationsTest(SOURCE, new JavaTransformer(), readTestFile());
    }

    @Test
    @Override
    public void testTransformWithIrrelevantTransformations() {

        transformWithIrrelevantTransformationsTest(SOURCE, new JavaTransformer(UNUSED_TRANSFORMATIONS), readTestFile(),
                UNUSED_TRANSFORMATIONS);
    }

    @Test(expected = RuntimeException.class)
    @Override
    public void testTransformWithClosedStream() throws IOException {

        transformWithClosedStreamTest(new JavaTransformer(), readTestFile(), ALL_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testTransformWithNullTransformations() {

        transformWithNullTransformationsTest(new JavaTransformer(), readTestFile());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testTransformWithNullInputStream() {

        transformWithNullInputStreamTest(new JavaTransformer(), ALL_TRANSFORMATIONS);
    }
}
