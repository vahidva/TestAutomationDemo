package automation.web.pages;

import automation.web.objects.SoldObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class SoldPage extends SoldObjects {
    static {
        url = soldUrl;
    }


    public static String getUrl() {return soldUrl;}

    public static WebElement soldMenueElement() {
        if (driver == null)
            throw new WebDriverException("driver is null" );
        if (driver.findElements(By.xpath(sold_default)).size() > 0)
            return driver.findElement(By.xpath(sold_default));
        else if (driver.findElements(By.xpath(sold_other)).size() > 0)
            return driver.findElement(By.xpath(sold_other));
        else
            throw new WebDriverException("Cannot find element: Sold" );
    }
}