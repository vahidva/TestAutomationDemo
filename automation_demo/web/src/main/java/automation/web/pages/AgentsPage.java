package automation.web.pages;

import automation.web.objects.AgentsObjects;
import automation.web.objects.CommercialObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AgentsPage extends AgentsObjects {
    static {
        url = agentslUrl;
    }


    public static String getUrl() {return agentslUrl;}

    public static WebElement agentsMenueElement() {return driver.findElement(By.xpath(agentsMenueItem));}
}