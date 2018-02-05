package automation.web.actions;

import automation.web.pages.RentPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RentActions extends RentPage {
    private static final Logger LOG = LoggerFactory.getLogger(RentActions.class);

    public static void goToRentPage() {
        RentPage.rentMenueElement().click();
        verifyLandingPage();
    }

}
