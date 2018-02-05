package automation.web.pages;

import automation.web.objects.BuyObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuyPage extends BuyObjects {
    static {
        url = buyUrl;
    }

    public static String getUrl() {return buyUrl;}
    public static WebElement buyElement = driver.findElement(By.xpath(buy));

}