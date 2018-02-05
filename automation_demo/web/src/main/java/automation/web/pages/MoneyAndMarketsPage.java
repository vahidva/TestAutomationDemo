package automation.web.pages;

import automation.web.objects.LivingObjects;
import automation.web.objects.MoneyAndMarketsObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MoneyAndMarketsPage extends MoneyAndMarketsObjects {

    static {
        url = moneyAndMarketsUrl;
    }

    public static WebElement MoneyAndMarketsMenueElement() { return driver.findElement(By.xpath(moneyAndMarkets));}
}