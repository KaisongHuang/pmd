/*
 * User: tom
 * Date: Sep 12, 2002
 * Time: 2:01:10 PM
 */
package test.net.sourceforge.pmd.rules;

import net.sourceforge.pmd.rules.StringInstantiationRule;

public class StringInstantiationRuleTest extends RuleTst {

    public void test1() throws Throwable {
        runTest("StringInstantiation1.java", 2, new StringInstantiationRule());
    }

    public void test2() throws Throwable {
        runTest("StringInstantiation2.java", 0, new StringInstantiationRule());
    }

    public void test3() throws Throwable {
        runTest("StringInstantiation3.java", 0, new StringInstantiationRule());
    }

    public void test4() throws Throwable {
        runTest("StringInstantiation4.java", 0, new StringInstantiationRule());
    }
}
