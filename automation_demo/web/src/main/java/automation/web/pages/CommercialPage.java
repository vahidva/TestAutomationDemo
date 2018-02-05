package automation.web.pages;

import automation.web.objects.CommercialObjects;
import automation.web.objects.SoldObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class CommercialPage extends CommercialObjects {
    static {
        url = commercialUrl;
    }


    public static String getUrl() {return commercialUrl;}

    public static WebElement commercialMenueElement() {return driver.findElement(By.xpath(commercialMenueItem));}
}