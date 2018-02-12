package automation.config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Params {
    private static final Logger LOG = LoggerFactory.getLogger(Params.class);

    //Common Framework parameters
    public static String PROFILE;
    public static boolean STEP_RECORD;
    public static String DATA_FACTORY;
    public static String DATA_PATH;


    //Multi driver properties
    public static String PLATFORM;
    public static String BROWSER;
    public static Proxy PROXY;

    //Web parameters
    public static String DRIVER_ROOT_DIR;
    public static String SELENIUM_HOST;
    public static String SELENIUM_PORT;
    public static String SELENIUM_REMOTE_URL;
    public static Dimension BROWSER_WINDOW_SIZE;
    public static Integer BROWSER_WINDOW_WIDTH;
    public static Integer BROWSER_WINDOW_HEIGHT;
    public static String CHROME_BIN_PATH;

    //Node properties
    public static String REMOVABLE_DRIVE;

    public static void loadParams(Props props) {

        LOG.info("Loading Common framework properties...");
        PROFILE = props.getProp("profile");
        DATA_FACTORY = props.getSystemProp("data","yml");
        DATA_PATH = props.getProp("data.base.path");
        if (PROFILE.equals("WEB")){
            LOG.info("Loading WEB properties...");
            loadWebProperties(props);
        }
    }

    private static void loadWebProperties(Props props){
        BROWSER = props.getSystemProp("browser");

        SELENIUM_PORT = props.getProp("driverport");
        PLATFORM = props.getProp("platform","win32");
        BROWSER_WINDOW_WIDTH = Integer.parseInt(props.getProp("browser.width"));
        BROWSER_WINDOW_HEIGHT = Integer.parseInt(props.getProp("browser.height"));
        BROWSER_WINDOW_SIZE = new Dimension(BROWSER_WINDOW_WIDTH, BROWSER_WINDOW_HEIGHT);
        DRIVER_ROOT_DIR = props.getProp(
                "driver.root.dir");

        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
        System.setProperty("webdriver.ie.driver", getIEDriverPath());
        System.setProperty("webdriver.gecko.driver", getGeckoDriverPath());
        CHROME_BIN_PATH = props.getProp("chrome.binary.path","");
    }

    private static String getChromeDriverPath() {
        return DRIVER_ROOT_DIR+"chromedriver/"+PLATFORM+"/chromedriver.exe";
    }

    private static String getGeckoDriverPath() {
        return DRIVER_ROOT_DIR+"geckodriver/"+PLATFORM+"/geckodriver.exe";
    }

    private static String getIEDriverPath() {
        return DRIVER_ROOT_DIR+"iedriver/"+PLATFORM+"/IEDriverServer.exe";
    }
}
