package automation.web.pages;

import automation.web.objects.LivingObjects;
import automation.web.objects.VideoObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VideoPage extends VideoObjects {

    static {
        url = videoUrl;
    }

    public static WebElement videoMenueElement() { return driver.findElement(By.xpath(video));}
}