package shiver.me.timbers.transform.java;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.RuleAndTokenTestTemplate;

import static shiver.me.timbers.transform.language.test.RuleAndTokenTestUtils.testEachTransformationInPackage;

public class RuleAndTokenTest implements RuleAndTokenTestTemplate {

    @Test
    @Override
    public void testAllTypeTransformations() {

        testEachTransformationInPackage("shiver.me.timbers.transform.java.type");
    }

    @Test
    @Override
    public void testAllRuleTransformations() {

        testEachTransformationInPackage("shiver.me.timbers.transform.java.rules");
    }
}
