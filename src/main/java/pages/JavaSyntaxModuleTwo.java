package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class JavaSyntaxModuleTwo {

    private WebDriver browser;

    public JavaSyntaxModuleTwo(WebDriver browser) {
        this.browser = browser;
    }

    public String getText() {
        WebElement textAboutJava = browser.findElement(Locators.JavaSyntaxModuleTwo.JAVA_Syntax);
        return textAboutJava.getText();
    }
}
