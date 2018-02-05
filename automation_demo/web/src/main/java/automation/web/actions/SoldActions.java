package automation.web.actions;

import automation.web.pages.BuyPage;
import automation.web.pages.MainMenuPageElements;
import automation.web.pages.SoldPage;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automation.utils.framework.Assert.assertTrue;

public class SoldActions extends SoldPage {
    private static final Logger LOG = LoggerFactory.getLogger(SoldActions.class);

    public static void goToSoldPage() {
        SoldPage.soldMenueElement().click();
        verifyLandingPage();
    }
}
