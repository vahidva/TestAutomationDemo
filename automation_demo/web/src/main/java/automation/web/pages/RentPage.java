package automation.web.pages;

import automation.web.objects.RentObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class RentPage extends RentObjects {
    static {
        url = rentUrl;
    }


    public static String getUrl() {return rentUrl;}
    public static WebElement rentElement = driver.findElement(By.xpath(rent_default));

    public static WebElement rentMenueElement() {
        if (driver.findElements(By.xpath(rent_default)).size() > 0)
            return driver.findElement(By.xpath(rent_default));
        else if (driver.findElements(By.xpath(rent_other)).size() > 0)
            return driver.findElement(By.xpath(rent_other));
        else
            throw new WebDriverException("Cannot find element: Rent" );
    }

}