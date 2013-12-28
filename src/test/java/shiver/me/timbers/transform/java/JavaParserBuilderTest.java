package shiver.me.timbers.transform.java;

import org.junit.Test;
import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.TokenTransformation;

import static org.junit.Assert.assertNotNull;
import static shiver.me.timbers.transform.antlr4.NullTokenTransformation.NULL_TOKEN_TRANSFORMATION;

public class JavaParserBuilderTest {

    private static final String SOURCE = "";

    private static final Transformations<TokenTransformation> TRANSFORMATIONS =
            new IndividualTransformations<TokenTransformation>(NULL_TOKEN_TRANSFORMATION);

    @Test
    public void testBuildParser() {

        assertNotNull("a built parser should be produced.",
                new JavaParserBuilder().buildParser(SOURCE, TRANSFORMATIONS));
    }

    @Test(expected = NullPointerException.class)
    public void testBuildParserWithNullSourceString() {

        new JavaParserBuilder().buildParser(null, TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    public void testBuildParserWithNullTransformations() {

        new JavaParserBuilder().buildParser(SOURCE, null);
    }

    @Test
    public void testParse() {

        final JavaParserBuilder parserBuilder = new JavaParserBuilder();

        final JavaParser parser = parserBuilder.buildParser(SOURCE, TRANSFORMATIONS);

        assertNotNull("parse should produce a parse tree.", parserBuilder.parse(parser));
    }

    @Test(expected = NullPointerException.class)
    public void testParseWithNullParser() {

        new JavaParserBuilder().parse(null);
    }
}
