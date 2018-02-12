package automation.web.pages;

import automation.web.objects.BuyObjects;
import automation.web.objects.SignInObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInPage extends SignInObjects {
    static {
        url = signInUrl;
    }

    public static String getUrl() {return signInUrl;}

//    public static WebElement signInElement = driver.findElement(By.className(signInMenuItem));
    public static WebElement emailElement = driver.findElement(By.name(email));
    public static WebElement passwordElement = driver.findElement(By.name(password));
    public static WebElement logInElement = driver.findElement(By.xpath(logIn));

}