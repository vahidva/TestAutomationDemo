package automation.web.actions;

import automation.utils.framework.Assert;
import automation.web.pages.MainMenuPageElements;
import automation.web.pages.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainMenuActions extends MainMenuPageElements {
    private static final Logger LOG = LoggerFactory.getLogger(MainMenuActions.class);

    public static void mainMenuNewsClick() {
        MainMenuPageElements.mainMenuNewsElement().click();
    }

    public static void mainMenuMoreClick() {
        MainMenuPageElements.mainMenuMoreElement().click();
    }

    public static void navigateBack() {navigateToPreviousPageUsingBrowserBackButton();}

//    public static void navigateToMenuItem(String pageName) throws InterruptedException {
//        for (WebElement element: MainMenuPageElements.desktopNavigationList()) {
//            if (element.getText().toLowerCase().equals(pageName)) {
//                LOG.info(" element found:" + pageName);
//                element.click();
//                Thread.sleep(2000);
//                return;
//            }
//        }
//    }

    public static void navigateToMenuItem(String menuItem) {
        WebElement element = driver.findElement(By.linkText(menuItem));
        element.click();
    }


    public static void signOut() throws InterruptedException {
        userAvatarElement().click();
        logOutElement().click();
        SignInActions.verifyUserSignedOut();
    }
}
