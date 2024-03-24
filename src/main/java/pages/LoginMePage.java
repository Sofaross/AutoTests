package pages;

import org.openqa.selenium.WebDriver;

public class LoginMePage {

    private WebDriver browser;

    public LoginMePage(WebDriver browser) {
        this.browser = browser;
    }

    public WebDriver getBrowser() {
        return browser;
    }



}
