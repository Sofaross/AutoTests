package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class LoginPage {
    private WebDriver browser;

    public LoginPage(WebDriver browser) {
        this.browser = browser;
    }

    public LoginMePage enterLoginAndPassword(String login, String password) {
        WebElement loginField = browser.findElement(Locators.Login.login);
        loginField.sendKeys(login);
        WebElement passwordField = browser.findElement(Locators.Login.password);
        passwordField.sendKeys(password);
        WebElement loginButton = browser.findElement(Locators.Login.loginButton);
        loginButton.click();
        return new LoginMePage(browser);
    }

}
