package automation.web.pages;

import automation.web.objects.AdviceObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvicePage extends AdviceObjects {

    static {
        url = adviceUrl;
    }
    public static String getUrl() {return url;}

    public static WebElement adviceMenueElement() { return driver.findElement(By.xpath(advice));}
}