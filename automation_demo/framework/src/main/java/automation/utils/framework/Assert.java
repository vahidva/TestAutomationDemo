package automation.utils.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assert {
    private static final Logger LOG = LoggerFactory.getLogger(Assert.class);

    public static void assertTrue(boolean actual) {
        LOG.info("The expected value: true");
        LOG.info("The actual value: "+actual);
        org.testng.AssertJUnit.assertTrue(actual);
    }

    public static void assertText(String expected, String actual) {
        LOG.info("The expected value: "+expected);
        LOG.info("The actual value: "+actual);
        org.testng.AssertJUnit.assertEquals(expected,actual);
    }

    public static void assertEquals(long expected, long actual) {
        LOG.info("The expected value: "+expected);
        LOG.info("The actual value: "+actual);
        org.testng.AssertJUnit.assertEquals(expected,actual);
    }

    public static void assertEquals(Object expected, Object actual) {
        LOG.info("The expected value: "+expected);
        LOG.info("The actual value: "+actual);
        org.testng.AssertJUnit.assertEquals(expected,actual);
    }
}
