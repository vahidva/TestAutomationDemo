package automation.web.pages;

import automation.web.objects.AdviceObjects;
import automation.web.objects.LivingObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LivingPage extends LivingObjects {

    static {
        url = livingUrl;
    }

    public static WebElement livingMenueElement() { return driver.findElement(By.xpath(living));}
}