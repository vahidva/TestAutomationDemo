package automation.web.pages;

import automation.web.objects.MainMenuObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainMenuPageElements extends MainMenuObjects {

    public static WebElement mainMenuNewsElement() {
        return driver.findElement(By.linkText("News"));
    }

    public static WebElement mainMenuMoreElement() {
        return driver.findElement(By.linkText("More"));
    }

    public static List<WebElement> desktopNavigationList() {return driver.findElement(By.className(desktopNavigation)).findElements(By.className("desktop-nav__menu-option"));};

    public static WebElement userAvatarElement() {return driver.findElement(By.className(userAvatar));}
    public static WebElement logOutElement() {return driver.findElement(By.xpath(logOut));}
}