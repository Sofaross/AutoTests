import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class SmokeTest {

    private WebDriver browser;

    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://javarush.com/");
    }

    @Test
    public void checkValidatorTextModuleOnePath1(){

        MainPage mainPage = new MainPage(browser);

        JavaSyntaxModuleOne javaSyntaxModuleOnePage = mainPage
                .clickQuestButton()
                .clickModuleOneButton();

        String text = javaSyntaxModuleOnePage.getTextPath1();

        Assert.assertEquals(text,"Но главное — вы решите очень много задач разной сложности. Не переживайте, если у вас нет опыта в программировании: чтобы “догнать” материал, у вас будут и онлайн-занятия с менторами, и факультативы. В конце модуля, после знакомства с Git, вас ожидает итоговый проект — написание криптоанализатора.");

    }

    @Test
    public void checkValidatorTextModuleOnePath2(){

        MainPage mainPage = new MainPage(browser);

        JavaSyntaxModuleOne javaSyntaxModuleOnePage = mainPage
                .clickQuestButton()
                .clickModuleOneButton();

        String text = javaSyntaxModuleOnePage.getTextPath2();

        Assert.assertEquals(text,"Модуль Java Syntax — введение в программирование на Java. В нем — 28 уровней, в рамках которых вы узнаете, что такое классы, объекты, методы и переменные. Изучите основные типы данных, массивы, условные операторы и циклы. Поверхностно познакомитесь с коллекциями, списками и дженериками, основами ООП, а также начнете работать в IntelliJ IDEA.");
    }

    @Test
    public void checkValidatorTextModuleTwo(){

        MainPage mainPage = new MainPage(browser);

        JavaSyntaxModuleTwo javaSyntaxModuleTwo = mainPage
                .clickQuestButton()
                .clickModuleTwoButton();

        String text = javaSyntaxModuleTwo.getText();

        Assert.assertEquals(text,"Модуль “Java Core”");

    }

    @Test
    public void checkValidatorTextModuleThree() {

        MainPage mainPage = new MainPage(browser);

        JavaSyntaxModuleThree javaSyntaxModuleThree = mainPage
                .clickQuestButton()
                .clickModuleThreeButton();

        String text = javaSyntaxModuleThree.getText();

        Assert.assertEquals(text,"Модуль “Java Professional”");
    }

    @Test
    public void checkValidatorTextModuleFour() {

        MainPage mainPage = new MainPage(browser);

        JavaSyntaxModuleFour javaSyntaxModuleFour = mainPage
                .clickQuestButton()
                .clickModuleFourButton();

        String text = javaSyntaxModuleFour.getText();

        Assert.assertEquals(text,"Модуль “Работа с базами данных. Hibernate”");
    }


// Проблемы с XPath
//    @Test
//    public void checkLoginButton() throws InterruptedException {
//
//        String saitUrl = "https://javarush.com/me";
//
//        MainPage mainPage = new MainPage(browser);
//
//        LoginMePage loginMePage = mainPage
//                .clickWelcomeButton()
//                .clickLoginButton()
//                .enterLoginAndPassword("admin", "admin");
//
//        Assert.assertEquals(loginMePage.getBrowser().getPageSource(), saitUrl);
//    }


    @After
    public void closeBrowser() {
        browser.quit();
    }
}
