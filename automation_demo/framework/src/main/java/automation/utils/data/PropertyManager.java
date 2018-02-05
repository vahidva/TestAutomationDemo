package automation.utils.data;

import automation.config.Params;
import org.apache.commons.beanutils.PropertyUtils;
import org.ho.yaml.Yaml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class PropertyManager {
    private static final Logger LOG = LoggerFactory.getLogger(PropertyManager.class);

    public static String readPropertyFromYml(String file,String key){
        Object ret = null;
        LOG.info("Retrieving YML data for the key : "+key);
        try {
            File yml = new File(Params.DATA_PATH+file+".yml");
            Object env = Yaml.load(yml);
            ret = PropertyUtils.getProperty(env,key);
        } catch (Exception e) {
            LOG.error("Error while reading yml file");
            e.printStackTrace();
        }
        return ret.toString();
    }
}
