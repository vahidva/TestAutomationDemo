package automation.web.actions;

import automation.web.pages.LivingPage;
import automation.web.pages.SharePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShareActions extends SharePage {
    private static final Logger LOG = LoggerFactory.getLogger(ShareActions.class);

    public static void goToSharePage() {
        SharePage.shareMenueElement().click();
        verifyLandingPage();
    }
}
