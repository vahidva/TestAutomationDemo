package automation.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class Props {
    private static final Logger LOG = LoggerFactory.getLogger(Props.class);
    private Properties properties;

    public Props(String configPropertyFileLocation){
        this.properties = new Properties();
        try (InputStream inputStream = new FileInputStream(configPropertyFileLocation)) {
            this.properties.load(inputStream);
        } catch (IOException e) {
            LOG.error(e.getMessage());
        }
    }

    public String getProp(String key) {
        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return properties.getProperty(key);

        }
    }

    public String getProp(String key,String def) {
        if ((key == null) || key.isEmpty()) {
            return def;
        } else {
            return properties.getProperty(key);
        }
    }

    public String getSystemProp(String key) {
        return System.getProperty(key);
    }

    public String getSystemProp(String key, String def) {
        String value = System.getProperty(key);
        if ((value == null) || value.isEmpty()) {
            return def;
        } else {
            return value;
        }
    }


}
