package automation.features.steps.web;

import automation.features.data.ParamsLoader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepsHook {
    private static final Logger LOG = LoggerFactory.getLogger(StepsHook.class);

    public StepsHook(){
    }

    @Before
    public void setUpSteps(Scenario scenario) {
        LOG.info("Before Steps scenario");
        ParamsLoader.init();
    }

    @After
    public void tearDownSteps(Scenario scenario) {
        LOG.info("After Steps scenario");
    }
}
