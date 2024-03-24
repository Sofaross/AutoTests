package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class QuestsPage {

    private WebDriver browser;

    public QuestsPage(WebDriver browser) {
        this.browser = browser;
    }

    public JavaSyntaxModuleOne clickModuleOneButton() {
        WebElement javaLectureButton = browser.findElement(Locators.Quests.JAVA_module_one);
        javaLectureButton.click();
        return new JavaSyntaxModuleOne(browser);
    }

    public JavaSyntaxModuleTwo clickModuleTwoButton() {
        WebElement javaModuleButton = browser.findElement(Locators.Quests.JAVA_module_two);
        javaModuleButton.click();
        return new JavaSyntaxModuleTwo(browser);
    }

    public JavaSyntaxModuleThree clickModuleThreeButton() {
        WebElement javaModuleButton = browser.findElement(Locators.Quests.JAVA_module_three);
        javaModuleButton.click();
        return new JavaSyntaxModuleThree(browser);
    }

    public JavaSyntaxModuleFour clickModuleFourButton() {
        WebElement javaModuleButton = browser.findElement(Locators.Quests.JAVA_module_four);
        javaModuleButton.click();
        return new JavaSyntaxModuleFour(browser);
    }

}
