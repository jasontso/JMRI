package jmri.jmrit.throttle;

import java.awt.GraphicsEnvironment;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 * Test simple functioning of FunctionPanel
 *
 * @author	Paul Bender Copyright (C) 2016
 */
public class FunctionPanelTest {

    @Test
    public void testCtor() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        FunctionPanel frame = new FunctionPanel(); // not a panel despite class name
        Assert.assertNotNull("exists", frame);
    }

    @Before
    public void setUp() throws Exception {
        apps.tests.Log4JFixture.setUp();
    }

    @After
    public void tearDown() throws Exception {
        apps.tests.Log4JFixture.tearDown();
    }
}
