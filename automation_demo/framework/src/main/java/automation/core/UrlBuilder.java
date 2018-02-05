package automation.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UrlBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(UrlBuilder.class);

    public static void startAtHomePage(String basePath) {
        if(WebDriverHelper.getWebDriver() == null){
            WebDriverHelper.launchBrowser();
        }
        LOG.info("Loading URL in current browser: "+basePath);
        WebDriverHelper.getWebDriver().navigate().to((basePath));
    }

    public static void loadUrl(String url){
        LOG.info("Loading URL in current browser: "+url);
        WebDriverHelper.getWebDriver().navigate().to((url));
    }

    public static void refresh() {
        WebDriverHelper.getWebDriver().navigate().refresh();
    }

}
