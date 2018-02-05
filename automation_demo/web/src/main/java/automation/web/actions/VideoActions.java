package automation.web.actions;

import automation.web.pages.LivingPage;
import automation.web.pages.VideoPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VideoActions extends LivingPage {
    private static final Logger LOG = LoggerFactory.getLogger(VideoActions.class);

    public static void goToVideoPage() {
        VideoPage.videoMenueElement().click();
        verifyLandingPage();
    }
}
