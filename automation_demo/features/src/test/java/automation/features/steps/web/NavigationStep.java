package automation.features.steps.web;

import automation.web.actions.*;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationStep {
    private static final Logger LOG = LoggerFactory.getLogger(NavigationStep.class);

    @When("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String pageName) {
        switch (pageName.toLowerCase()) {
            case "home":
            case "buy":
                BuyActions.goToBuyPage();
                break;
            case "rent":
                RentActions.goToRentPage();
                break;
            case "new homes":
                NewHomeActions.goToNewHomePage();
                break;
            case "sold":
                SoldActions.goToSoldPage();
                break;
            case "commercial":
                CommercialActions.goToCommercialPage();
                break;
            case "agents":
                AgentsActions.goToAgentsPage();
                break;
            case "sign in":
                MainMenuActions.navigateToMenuItem(pageName);
                SignInActions.verifyLandingPage();
                break;

            default:
                throw new IllegalArgumentException("Page: " + pageName + " does not exist or navigation to the page has not been implemented!");

        }
    }


    @When("^I navigate to \"([^\"]*)\" page from News Menu$")
    public void iNavigateToPageFromNewsMenu(String pageName) {

        MainMenuActions.mainMenuNewsClick();
        switch (pageName.toLowerCase()) {
            case "news":
                NewsActions.goToNewsPage();
                break;
            case "advice":
                AdviceActions.goToAdvicePage();
                break;
            case "living":
                LivingActions.goToLivingPage();
                break;
            case "money & markets":
                MoneyAndMarketsActions.goToMoneyAndMarketsPage();
                break;
            case "video":
                VideoActions.goToVideoPage();
                break;
            default:
                throw new IllegalArgumentException("Page: " + pageName + " does not belong to News Menu!");
        }
    }

    @When("^I navigate to \"([^\"]*)\" page from More Menu$")
    public void iNavigateToPageFromMoresMenu(String pageName) {

        MainMenuActions.mainMenuMoreClick();
        switch (pageName.toLowerCase()) {
            case "share":
                ShareActions.goToSharePage();
                break;
            case "home price guide":
            case "auction results":
            case "suburb profiles":
            case "home loans":
            case "place an add":
            default:
                throw new IllegalArgumentException("Page: " + pageName + " does not belong to More Menu or has not been implemented yet!");
        }
    }

    @When("^I navigate back$")
    public void iNavigateBack() {
        MainMenuActions.navigateBack();
    }

}
