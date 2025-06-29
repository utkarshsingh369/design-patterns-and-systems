package com.utkarsh.shared;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.slf4j.Logger;

/**
 * Unit test for simple App.
 */
public class GlobalLoggerTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GlobalLoggerTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GlobalLoggerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Logger logger = GlobalLogger.getLoggerInstance(GlobalLoggerTest.class);
        Logger logger1 = GlobalLogger.getLoggerInstance(GlobalLoggerTest.class);

        assertSame("GlobalLogger should return same instance for same class", logger, logger1);
    }
}
