package jmri.jmrit.withrottle;

import jmri.util.JUnitUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Test simple functioning of TurnoutController
 *
 * @author	Paul Bender Copyright (C) 2016
 */
public class TurnoutControllerTest extends TestCase {

    public void testCtor() {
        TurnoutController panel = new TurnoutController();
        Assert.assertNotNull("exists", panel );
    }

    // from here down is testing infrastructure
    public TurnoutControllerTest(String s) {
        super(s);
    }

    // Main entry point
    static public void main(String[] args) {
        String[] testCaseName = {"-noloading", TurnoutControllerTest.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    // test suite from all defined tests
    public static Test suite() {
        TestSuite suite = new TestSuite(TurnoutControllerTest.class);
        return suite;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        apps.tests.Log4JFixture.setUp();
    }
    
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        JUnitUtil.resetInstanceManager();
        apps.tests.Log4JFixture.tearDown();
    }
}
