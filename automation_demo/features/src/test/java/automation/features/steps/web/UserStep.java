package automation.features.steps.web;

import automation.core.UrlBuilder;
import automation.utils.data.PropertyManager;
import automation.web.actions.MainMenuActions;
import automation.web.actions.SignInActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserStep {
    private static final Logger LOG = LoggerFactory.getLogger(UserStep.class);

    @And("^I sign in with username \"([^\"]*)\" and passwork \"([^\"]*)\"$")
    public void iSignInWithUserNameAndPassword(String username, String password) throws InterruptedException {
        LOG.info("Going to Sign in ");
        SignInActions.signIn(username, password);
    }

    @And("^I sign out$")
    public void iSingOut() throws InterruptedException {
        MainMenuActions.signOut();
    }

}
