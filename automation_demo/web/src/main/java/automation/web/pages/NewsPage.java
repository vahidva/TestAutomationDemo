package automation.web.pages;

import automation.web.objects.NewsObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewsPage extends NewsObjects {

    static {
        url = newsUrl;
    }
    public static String getUrl() {return newsUrl;}

    public static WebElement newsMenueElement() { return driver.findElement(By.xpath(news));}
}