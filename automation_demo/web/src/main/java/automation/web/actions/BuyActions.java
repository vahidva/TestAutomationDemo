package automation.web.actions;

import automation.web.pages.BuyPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyActions extends BuyPage {
    private static final Logger LOG = LoggerFactory.getLogger(BuyActions.class);

    public static void goToBuyPage() {
        BuyPage.buyElement.click();
        verifyLandingPage();
    }
}
