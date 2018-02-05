package automation.web.actions;

import automation.web.pages.AgentsPage;
import automation.web.pages.CommercialPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgentsActions extends AgentsPage {
    private static final Logger LOG = LoggerFactory.getLogger(AgentsActions.class);

    public static void goToAgentsPage() {
        AgentsPage.agentsMenueElement().click();
        verifyLandingPage();
    }
}
