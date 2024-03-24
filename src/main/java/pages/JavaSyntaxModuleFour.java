package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class JavaSyntaxModuleFour {

    private WebDriver browser;

    public JavaSyntaxModuleFour(WebDriver browser) {
        this.browser = browser;
    }

    public String getText() {
        WebElement textAboutJava = browser.findElement(Locators.JavaSyntaxModuleFour.JAVA_Syntax);
        return textAboutJava.getText();
    }
}
