package automation.web.objects;

import automation.object.PageObject;

public class SoldObjects extends PageObject {

    public static final String soldUrl = "https://www.domain.com.au/?mode=sold";

    public static final String sold_default = "//*[@id=\"homepage\"]/div/div/div[1]/header/div[2]/div/nav/ul/li[4]/a";
    public static final String sold_other = "//*[@id=\"page-inner-wrap\"]/header/div/header/div[1]/div/nav/ul/li[4]/a";
}
