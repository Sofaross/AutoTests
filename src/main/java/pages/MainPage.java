package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class MainPage {

    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    public QuestsPage clickQuestButton() {
        WebElement questButton = browser.findElement(Locators.MainPage.JAVA_quest);
        questButton.click();
        return new QuestsPage(browser);
    }

    public WelcomePage clickWelcomeButton() {
        WebElement welcomeButton = browser.findElement(Locators.MainPage.JAVA_welcome);
        welcomeButton.click();
        return new WelcomePage(browser);
    }
}
