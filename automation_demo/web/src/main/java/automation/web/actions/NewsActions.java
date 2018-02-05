package automation.web.actions;

import automation.web.pages.NewsPage;
import automation.web.pages.SoldPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automation.utils.framework.Assert.assertTrue;

public class NewsActions extends NewsPage {
    private static final Logger LOG = LoggerFactory.getLogger(NewsActions.class);

    public static void goToNewsPage() {
        NewsPage.newsMenueElement().click();
        verifyLandingPage();
    }
}
