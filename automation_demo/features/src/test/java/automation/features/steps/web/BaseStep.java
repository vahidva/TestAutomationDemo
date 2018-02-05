package automation.features.steps.web;

import automation.core.UrlBuilder;
import automation.utils.data.PropertyManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseStep {
    private static final Logger LOG = LoggerFactory.getLogger(BaseStep.class);
      @Given("^I launch the \"([^\"]*)\" website")
    public void iLaunchTheWebsite(String website) throws Throwable {
        String url = PropertyManager.readPropertyFromYml(website, "url");
        UrlBuilder.startAtHomePage(url);

   }

    @And("^I wait for (\\d+) seconds$")
    public void iRefreshThePage(int seconds) throws Throwable {
        Thread.sleep(seconds * 1000);
    }

    @And("^I refresh the page$")
    public void iRefreshThePage() throws Throwable {
        UrlBuilder.refresh();
    }
}
