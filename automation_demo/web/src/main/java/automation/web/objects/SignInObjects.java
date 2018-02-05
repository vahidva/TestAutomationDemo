package automation.web.objects;

import automation.object.PageObject;

public class SignInObjects extends PageObject {

    public static final String signInUrl = "https://auth.domain.com.au/v1/login?signin=";

    public static final String email = "username";
    public static final String password = "password";
    public static final String logIn = "/html/body/div[1]/div/div[1]/div/div/div/div/div[2]/form/button";
}
