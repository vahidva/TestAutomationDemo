package automation.web.pages;

import automation.web.objects.LivingObjects;
import automation.web.objects.ShareObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SharePage extends ShareObjects {

    static {
        url = shareUrl;
    }

    public static WebElement shareMenueElement() { return driver.findElement(By.xpath(share));}
}