package automation.features.data;

import automation.config.Params;
import automation.config.Props;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class ParamsLoader extends Params {
    private static final Logger LOG = LoggerFactory.getLogger(ParamsLoader.class);
    static {
        Props props = new Props(new File("../support/properties/core.properties").getAbsolutePath());
        loadParams(props);
    }

    public static void init(){
        LOG.info("Initializing the parameters");
    }
}
