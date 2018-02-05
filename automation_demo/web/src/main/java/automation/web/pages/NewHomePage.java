package automation.web.pages;

import automation.web.objects.NewHomeObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewHomePage extends NewHomeObjects {
    static {
        url = newHomeUrl;
    }

    public static String getUrl() {return newHomeUrl;}
    public static WebElement newHomeElement = driver.findElement(By.xpath(newHomes));
    public static WebElement newApartmentOffThePlan() {return driver.findElement(By.id(newApartments));}
    public static WebElement newHouseAndLand() {return driver.findElement(By.id(newHouseAndLand));}
    public static WebElement land() {return driver.findElement(By.id(land));}
    public static WebElement newHomeDesign() {return driver.findElement(By.id(newHomeDesigns));}
    public static WebElement townHouses() {return driver.findElement(By.id(townHouses));}


}