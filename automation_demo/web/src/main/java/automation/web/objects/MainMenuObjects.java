package automation.web.objects;

import automation.object.PageObject;

public class MainMenuObjects extends PageObject {

    public static final String[] mainMenu_News = {
            "//*[@id=\"homepage\"]/div/div/div[1]/header/div[2]/div/nav/ul/li[6]/a",
            "//*[@id=\"page-inner-wrap\"]/header/div/header/div[1]/div/nav/ul/li[6]/a",
            "/html/body/div[2]/header/div[1]/div[1]/nav/ul/li[6]/a",
            "/html/body/div[1]/header/div[1]/div[1]/nav/ul/li[6]/a",
            "/html/body/div[1]/div/div/div[1]/header/div[2]/div/nav/ul/li[7]/a"};

    public static final String[] mainMenue_More = {
            "//*[@id=\"homepage\"]/div/div/div[1]/header/div[2]/div/nav/ul/li[8]/a",
            "//*[@id=\"page-inner-wrap\"]/header/div/header/div[1]/div/nav/ul/li[9]/a",
            "/html/body/div[2]/header/div[1]/div[1]/nav/ul/li[8]/a",
            "/html/body/div[1]/header/div[1]/div[1]/nav/ul/li[8]/a",
            "//*[@id=\"page-body\"]/div[3]/header/div[1]/div/nav/ul/li[9]/a",
            "//*[@id=\"fe-co-find-an-agent\"]/div/div/div/div/div/header/div[2]/div/nav/ul/li[8]/a",
            "/html/body/div[1]/div/div/div[1]/header/div[2]/div/nav/ul/li[9]/a"};

    public static final String desktopNavigation = "desktop-nav__list";

    public static final String userAvatar = "header-member__avatar-toggle";
    public static final String logOut = "//a[@href=\"https://www.domain.com.au/ore/public/authentication/logout.aspx\"]";


}
