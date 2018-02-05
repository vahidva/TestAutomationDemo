package automation.web.actions;

import automation.web.pages.CommercialPage;
import automation.web.pages.SoldPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommercialActions extends CommercialPage {
    private static final Logger LOG = LoggerFactory.getLogger(CommercialActions.class);

    public static void goToCommercialPage() {
        CommercialPage.commercialMenueElement().click();
        verifyLandingPage();
    }
}
