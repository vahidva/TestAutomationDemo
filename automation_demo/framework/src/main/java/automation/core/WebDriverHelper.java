package automation.core;

import automation.config.Params;
import automation.object.PageObject;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;

public class WebDriverHelper extends EventFiringWebDriver {
    private static final Logger LOG = LoggerFactory
            .getLogger(WebDriverHelper.class);
    private static RemoteWebDriver REAL_DRIVER = null;
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            closeWebDriver();
        }
    };
    private WebDriverHelper() {
        super(REAL_DRIVER);
    }

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    protected static void launchBrowser(){
        try {
            switch (Params.BROWSER.toLowerCase()) {
                case ("chrome"):
                    startChromeDriver();
                    break;
                case ("firefox"):
                    startFireFoxDriver();
                    break;
                case ("iexplorer"):
                    startIEDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Browser " + Params.BROWSER + " not supported");


            }
            PageObject pageObject = new PageObject();

        } catch (IllegalStateException e) {
            LOG.error("FIX path for driver.root.dir in pom.xml " + Params.DRIVER_ROOT_DIR
                    + " Browser parameter " + Params.BROWSER + "  not supported");
        }
    }

    private static void startIEDriver() {
        DesiredCapabilities capabilities = getInternetExploreDesiredCapabilities();
        if (Params.SELENIUM_HOST == null || Params.SELENIUM_HOST.isEmpty())
            REAL_DRIVER = new InternetExplorerDriver(capabilities);
        else {
            try {
                REAL_DRIVER = getRemoteWebDriver(capabilities);
            } catch (MalformedURLException e) {
                LOG.error(Params.SELENIUM_REMOTE_URL + " Error " + e.getMessage());
            }
        }
        maximize();
    }

    private static void startFireFoxDriver() {
        DesiredCapabilities capabilities = getFireFoxDesiredCapabilities();
        REAL_DRIVER = new FirefoxDriver(capabilities);
        maximize();
    }

    public static void resizeBrowser() {
        REAL_DRIVER.manage().window().setSize(Params.BROWSER_WINDOW_SIZE);
    }

    public static void maximize() {
        REAL_DRIVER.manage().window().maximize();
    }

    private static WebDriver startChromeDriver() {
        DesiredCapabilities capabilities = getChromeDesiredCapabilities();

       REAL_DRIVER = new ChromeDriver(
                    ChromeDriverService.createDefaultService(), capabilities);
        maximize();
        return REAL_DRIVER;
    }

    private static DesiredCapabilities getChromeDesiredCapabilities() {

        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.DRIVER, Level.OFF);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
        //capabilities.setCapability(CapabilityType.PROXY, Params.PROXY);
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-web-security");
        chromeOptions.addArguments("--test-type");
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        if(!Params.CHROME_BIN_PATH.isEmpty())
            chromeOptions.setBinary(Params.CHROME_BIN_PATH);
        capabilities.setCapability("chrome.verbose", false);
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        return capabilities;
    }

    private static DesiredCapabilities getFireFoxDesiredCapabilities() {
        DesiredCapabilities capabilities =new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setBrowserName("firefox");
        //capabilities.setCapability(FirefoxDriver.PROFILE,firefoxProfile() );
        capabilities.setCapability("disable-restore-session-state", true);
        capabilities.setCapability(CapabilityType.PROXY, Params.PROXY);
        capabilities.setCapability("marionette", true);

        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.download.folderList", 2);
        String autoDownloadMimeTypes = StringUtils.join(new String[]{
                "application/ecx-integrator-key-file",
                "application/pdf",
                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                "application/vnd.ms-excel",
                "text/csv"
        }, ",");

        firefoxProfile.setPreference("plugin.disable_full_page_plugin_for_types", autoDownloadMimeTypes);
        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", autoDownloadMimeTypes);
        capabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
        return capabilities;

    }

    private static DesiredCapabilities getInternetExploreDesiredCapabilities() {
        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.DRIVER, Level.OFF);
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
        capabilities.setCapability(
                        InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                        true);
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        capabilities.setCapability("requireWindowFocus", true);
        capabilities.setCapability("nativeEvents", false);
        //capabilities.setCapability(CapabilityType.PROXY, Params.PROXY);
        return capabilities;
    }

    private static RemoteWebDriver getRemoteWebDriver(DesiredCapabilities capabilities) throws MalformedURLException {
        Params.SELENIUM_REMOTE_URL = "http://" + Params.SELENIUM_HOST + ":" + Params.SELENIUM_PORT + "/wd/hub";
        LOG.info(Params.SELENIUM_REMOTE_URL + " Checking Selenium Remote URL");
        return new RemoteWebDriver(new URL(Params.SELENIUM_REMOTE_URL), (capabilities));
    }

    public static WebDriver getWebDriver() {
        return REAL_DRIVER;
    }

    public static void closeWebDriver() {
        LOG.info("Closing Webdriver");
        if(null != REAL_DRIVER){
            REAL_DRIVER.close();
            REAL_DRIVER.quit();
            REAL_DRIVER = null;
        }
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException(
                    "You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
        }
        super.close();
    }
}
