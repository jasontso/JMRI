package jmri.jmrix.lenz.li100f;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LI100AdapterTest.java
 *
 * Description:	tests for the jmri.jmrix.lenz.li100f.LI100Adapter class
 *
 * @author	Paul Bender
 * @version $Revision$
 */
public class LI100AdapterTest extends TestCase {

    public void testCtor() {
        LI100Adapter a = new LI100Adapter();
        Assert.assertNotNull(a);
    }

    // from here down is testing infrastructure
    public LI100AdapterTest(String s) {
        super(s);
    }

    // Main entry point
    static public void main(String[] args) {
        String[] testCaseName = {"-noloading", LI100AdapterTest.class.getName()};
        junit.swingui.TestRunner.main(testCaseName);
    }

    // test suite from all defined tests
    public static Test suite() {
        TestSuite suite = new TestSuite(LI100AdapterTest.class);
        return suite;
    }

    // The minimal setup for log4J
    protected void setUp() {
        apps.tests.Log4JFixture.setUp();
    }

    protected void tearDown() {
        apps.tests.Log4JFixture.tearDown();
    }

    private final static Logger log = LoggerFactory.getLogger(LI100AdapterTest.class.getName());

}
