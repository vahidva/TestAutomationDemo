package automation.web.objects;

import automation.object.PageObject;


public class RentObjects extends PageObject {

    public static final String rentUrl = "https://www.domain.com.au/?mode=rent";

    public static final String rent_default = "//*[@id=\"homepage\"]/div/div/div[1]/header/div[2]/div/nav/ul/li[2]/a";
    public static final String rent_other = "//*[@id=\"page-inner-wrap\"]/header/div/header/div[1]/div/nav/ul/li[2]/a";
}
