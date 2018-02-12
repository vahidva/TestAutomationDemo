package automation.web.actions;

import automation.core.UrlBuilder;
import automation.utils.framework.Assert;
import automation.web.objects.SignInObjects;
import automation.web.pages.BuyPage;
import automation.web.pages.MainMenuPageElements;
import automation.web.pages.SignInPage;
import com.sun.javafx.fxml.builder.URLBuilder;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automation.utils.framework.Assert.assertTrue;

public class SignInActions extends SignInPage {
    private static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);

    public static void verifyLandingPage() {
        assertTrue(driver.getCurrentUrl().contains(getUrl()));
    }

    public static void signIn(String username, String password) throws InterruptedException {
        emailElement.sendKeys(username);
        passwordElement.sendKeys(password);
        logInElement.click();
        Thread.sleep(2000);
        UrlBuilder.refresh();
        Thread.sleep(2000);
        verifyUserLoggedIn();
    }
    public static void verifyUserLoggedIn() {
        LOG.info("Verifying that the user has signed in successfully...");
        Assert.assertTrue(MainMenuPageElements.userAvatarElement().isDisplayed());
    }

    public static void verifyUserSignedOut() throws InterruptedException {
        LOG.info("Verifying that the user has signed out successfully...");
        Thread.sleep(2000);
        UrlBuilder.refresh();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed());

    }
}
