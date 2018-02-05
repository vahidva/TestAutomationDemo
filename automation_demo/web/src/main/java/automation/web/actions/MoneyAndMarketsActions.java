package automation.web.actions;

import automation.web.pages.LivingPage;
import automation.web.pages.MoneyAndMarketsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoneyAndMarketsActions extends MoneyAndMarketsPage {
    private static final Logger LOG = LoggerFactory.getLogger(MoneyAndMarketsActions.class);

    public static void goToMoneyAndMarketsPage() {
        MoneyAndMarketsPage.MoneyAndMarketsMenueElement().click();
        verifyLandingPage();
    }
}
