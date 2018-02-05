package automation.features.steps.web;

import automation.web.actions.NewHomeActions;
import cucumber.api.java.en.And;

public class NewHomeStep {

    @And("^I select New Apartments/Off the plan$")
    public void iSelectNewApartments() throws Throwable {
        NewHomeActions.newApartmentsClick();
    }

    @And("^I select New House and Land$")
    public void iSelectNewHouseAndLand() throws Throwable {
        NewHomeActions.newHouseAndLandClick();
    }

    @And("^I select Land$")
    public void iSelectLand() throws Throwable {
        NewHomeActions.landClick();
    }

    @And("^I select New Home Designs$")
    public void iSelectNewHomeDesigns() throws Throwable {
        NewHomeActions.newHomeDesignClick();
    }

    @And("^I select Townhouses$")
    public void iSelectTownHouses() throws Throwable {
        NewHomeActions.townHousesClick();
    }

}
