package automation.web.actions;

import automation.web.pages.BuyPage;
import automation.web.pages.NewHomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automation.utils.framework.Assert.assertTrue;

public class NewHomeActions extends NewHomePage {
    private static final Logger LOG = LoggerFactory.getLogger(NewHomeActions.class);

    public static void goToNewHomePage() {
        NewHomePage.newHomeElement.click();
        verifyLandingPage();
    }

    public static void newApartmentsClick() {
        NewHomePage.newApartmentOffThePlan().click();
    }

    public static void newHouseAndLandClick() {
        NewHomePage.newHouseAndLand().click();
    }

    public static void landClick() {
        NewHomePage.land().click();
    }

    public static void newHomeDesignClick() {
        NewHomePage.newHomeDesign().click();
    }

    public static void townHousesClick() {
        NewHomePage.townHouses().click();
    }

    public static void verifyLandingPage() {
        assertTrue(driver.getCurrentUrl().contains(getUrl()));
    }
}
