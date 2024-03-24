package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class WelcomePage {

    private WebDriver browser;

    public WelcomePage(WebDriver browser) {
        this.browser = browser;
    }

    public LoginPage clickLoginButton() {
        WebElement loginButton = browser.findElement(Locators.Welcome.JAVA_login);
        loginButton.click();
        return new LoginPage(browser);
    }
}
