package automation.web.actions;

import automation.web.pages.AdvicePage;
import automation.web.pages.NewsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automation.utils.framework.Assert.assertTrue;

public class AdviceActions extends AdvicePage {
    private static final Logger LOG = LoggerFactory.getLogger(AdviceActions.class);

    public static void goToAdvicePage() {
        AdvicePage.adviceMenueElement().click();
        verifyLandingPage();
    }
}
