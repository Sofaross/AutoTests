package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class JavaSyntaxModuleOne {

    private WebDriver browser;

    public JavaSyntaxModuleOne(WebDriver browser) {
        this.browser = browser;
    }

    public String getTextPath1() {
        WebElement textAboutJava = browser.findElement(Locators.JavaSyntaxModuleOne.JAVA_Syntax);
        return textAboutJava.getText();
    }

    public String getTextPath2() {
        WebElement textAboutJava = browser.findElement(Locators.JavaSyntaxModuleOne.JAVA_Syntax2);
        return textAboutJava.getText();
    }

}