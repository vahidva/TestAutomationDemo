package automation.web.actions;

import automation.web.pages.AdvicePage;
import automation.web.pages.LivingPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LivingActions extends LivingPage {
    private static final Logger LOG = LoggerFactory.getLogger(LivingActions.class);

    public static void goToLivingPage() {
        LivingPage.livingMenueElement().click();
        verifyLandingPage();
    }
}
