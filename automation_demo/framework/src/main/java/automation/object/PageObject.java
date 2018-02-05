package automation.object;

import automation.core.WebDriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automation.utils.framework.Assert.assertTrue;

public class PageObject{
    private static final long DRIVER_WAIT_TIME = 30;
    private static final Logger LOG = LoggerFactory.getLogger(PageObject.class);

    protected static WebDriver driver;

    protected static String url;

    public PageObject(){
        LOG.info("DEBUG:Calling the page object constructor");
        driver = WebDriverHelper.getWebDriver();
    }

    public static void verifyLandingPage() {
        LOG.info("expected URL: " + url + "\n actual URL: " + driver.getCurrentUrl());
        assertTrue(driver.getCurrentUrl().contains(url));

    }

    public static void navigateToPreviousPageUsingBrowserBackButton() {
        driver.navigate().back();
    }

}