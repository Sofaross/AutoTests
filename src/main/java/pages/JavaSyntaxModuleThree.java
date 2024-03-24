package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class JavaSyntaxModuleThree {

    private WebDriver browser;

    public JavaSyntaxModuleThree(WebDriver browser) {
        this.browser = browser;
    }

    public String getText() {
        WebElement textAboutJava = browser.findElement(Locators.JavaSyntaxModuleThree.JAVA_Syntax);
        return textAboutJava.getText();
    }
}
